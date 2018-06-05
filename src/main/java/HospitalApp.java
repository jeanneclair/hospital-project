import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// VirtualPetShelter shelter = new VirtualPetShelter();
		// VirtualPet pet1 = new VirtualPet("Junebug", "friendly tuxedo cat", 30, 40,
		// 35);

		Hospital hospital = new Hospital();
		Doctor phil = new Doctor("Phil", "1111", "Heart", 90000);
		Surgeon harry = new Surgeon("Harry", "2222", "Brain", 120000, true);
		Nurse jackie = new Nurse("Jackie", "3333", 6, 50000);
		Receptionist janine = new Receptionist("Janine", "4444", 45000, true);
		Janitor rosie = new Janitor("Rosie", "5555", 40000, true);

		hospital.employees.put("Phil", phil);
		hospital.employees.put("Harry", harry);
		hospital.employees.put("Jackie", jackie);
		hospital.employees.put("Janine", janine);
		hospital.employees.put("Rosie", rosie);

		employeeStatus(hospital);

		System.out.println("\nHere are the pay rates at High St. Hositpal:\n");

		for (Employee employee : hospital.getAllEmployees()) {

			System.out.println(employee.getName() + " gets paid a salary of " + employee.calculatePay() + " per year.");

		}

		System.out.println("\nSome Employees can administer patient care:\n");

		for (Employee employee : hospital.getAllEmployees()) {

			Patient patient = new Patient();
			if (employee instanceof CareForPatient) {

				((CareForPatient) employee).careForPatient(patient);
				System.out.println(
						employee.getName() + " has increased patient health to " + patient.getHealthLevel() + ".\n");
			}

		}
		System.out.println("Who do you want to fire?");
		String fireName = input.nextLine();
		hospital.fireEmployee(hospital.employees.get(fireName));
		
		employeeStatus(hospital);
		
	}

	private static void employeeStatus(Hospital hospital) {

		System.out.println("This is the status of your employees:");
		System.out.println("-------------------------------------");

		for (Employee employee : hospital.getAllEmployees()) {

			System.out.println(employee.toString());
		}

	}

}
