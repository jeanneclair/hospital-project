
public class Doctor extends Employee implements CareForPatient {

	private String specialty;
	
	public Doctor(String name, String employeeNumber, String specialty, int salary) {

		super(name, employeeNumber, salary);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}
	
	public void careForPatient(Patient patient) {
		patient.heal(10);
	}

}
