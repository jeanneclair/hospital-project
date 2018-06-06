import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

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

		Patient patient = new Patient();

		String menuChoice;

		Boolean softwareRunning = false;

		while (softwareRunning = true) {

			do {

				showMenu();
				menuChoice = input.nextLine();

			} while (!menuChoice.equals("1") && !menuChoice.equals("2") & !menuChoice.equals("3")
					&& !menuChoice.equals("4") && !menuChoice.equals("5") && !menuChoice.equals("6")
					&& !menuChoice.equals("7"));

			switch (menuChoice) {
			case "1":
				employeeStatus(hospital);
				break;

			case "2":
				employeeStatus(hospital);

				System.out.println("\nHere are the pay rates at High St. Hositpal:\n");

				for (Employee employee : hospital.getAllEmployees()) {

					System.out.println(
							employee.getName() + " gets paid a salary of " + employee.calculatePay() + " per year.");

				}	
				break;

			case "3":

				System.out.println("\nSome Employees can draw blood:\n");

				for (Employee employee : hospital.getAllEmployees()) {

					if (employee instanceof DrawBlood) {

						((DrawBlood) employee).drawBlood(patient);
						System.out.println(employee.getName() + " is capable of drawing blood.");
					}

				}
				break;

			case "4":

				System.out.println("\nSome Employees can administer patient care:\n");

				for (Employee employee : hospital.getAllEmployees()) {

					if (employee instanceof CareForPatient) {

						((CareForPatient) employee).careForPatient(patient);
						System.out.println(
								employee.getName() + " has increased patient health to " + patient.getHealthLevel());
					}

				}		
				break;

			case "5":


				System.out.println("Name:\n");
				String admitName = input.nextLine();
				admitName = admitName.substring(0, 1).toUpperCase() + admitName.substring(1).toLowerCase();
				System.out.println("Employee Number\n");
				String admitNum = input.nextLine();
				System.out.println("Salary:\n");
				int admitSalary = input.nextInt();
				input.nextLine();
				System.out.println("Is the employee a Nurse, Doctor, Surgeon, Receptionist, or Janitor");
				String employeeType = input.nextLine();
				employeeType = employeeType.substring(0, 1).toUpperCase() + employeeType.substring(1).toLowerCase();

				switch (employeeType) {
				case "Nurse":
					int admitNumOfPatients = 0;

					Nurse addNurse = new Nurse(admitName, admitNum, admitNumOfPatients, admitSalary);
					hospital.employees.put(admitName, addNurse);
					System.out.println("\nYou have added: " + admitName + " as a " + employeeType + ".");
					break;

				case "Doctor":
					System.out.println("What is the doctor's specialty?");
					String admitSpecialtyDoctor = input.nextLine();
					Doctor addDoctor = new Doctor(admitName, admitNum, admitSpecialtyDoctor, admitSalary);
					hospital.employees.put(admitNum, addDoctor);
					System.out.println("\nYou have added: " + admitName + " as a " + employeeType + ".");
					break;

				case "Surgeon":
					System.out.println("What is the doctor's specialty?");
					String admitSpecialtySurgeon = input.nextLine();
					Boolean isOperating = false;
					Surgeon addSurgeon = new Surgeon(admitName, admitNum, admitSpecialtySurgeon, admitSalary,
							isOperating);
					hospital.employees.put(admitName, addSurgeon);
					System.out.println("\nYou have added: " + admitName + " as a " + employeeType + ".");
					break;

				case "Receptionist":
					Boolean isOnPhone = false;
					Receptionist addReceptionist = new Receptionist(admitName, admitNum, admitSalary, isOnPhone);
					hospital.employees.put(admitName, addReceptionist);
					System.out.println("\nYou have added: " + admitName + " as a " + employeeType + ".");
					break;

				case "Janitor":
					Boolean isSweeping = false;
					Janitor addJanitor = new Janitor(admitName, admitNum, admitSalary, isSweeping);
					hospital.employees.put(admitName, addJanitor);
					System.out.println("\nYou have added: " + admitName + " as a " + employeeType + ".");
					break;

				}
				break;

			case "6":

				System.out.println("Who do you want to fire?");
				String fireName = input.nextLine();
				hospital.fireEmployee(hospital.employees.get(fireName));
				employeeStatus(hospital);
				break;

			case "7":

				System.out.println("Search employee by name:");
				String searchName = input.nextLine();

				for (Employee employee : hospital.getAllEmployees()) {

					if (employee.getName().equals(searchName)) {

						System.out.println(employee.toString());

					}

				}
				break;

			}//end switch statement
		}//end while loop

	}

	private static void showMenu() {
		System.out.println("\nPress '1' for employee status\n" + "Press '2' for employee pay rate\n"
				+ "Press '3' for employees who can draw blood\n" + "Press '4' for employees who can care for patients\n"
				+ "Press '5' to add an employee\n" + "Press '6' to fire an employee\n"
				+ "Press '7' to search by employee name\n");
	}

	private static void employeeStatus(Hospital hospital) {

		System.out.println("This is the status of your employees:");
		System.out.println("-------------------------------------");

		for (Employee employee : hospital.getAllEmployees()) {

			System.out.println(employee.toString());
		}

	}

}
