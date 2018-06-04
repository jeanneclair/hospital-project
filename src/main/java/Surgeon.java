
public class Surgeon extends Doctor {

	private String specialty;
	private boolean isOperating;

	public Surgeon(String name, String employeeNumber, String specialty, int salary, boolean isOperating) {
	
		super(name, employeeNumber, specialty, salary);
		this.specialty = specialty;
		this.isOperating = isOperating;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public void careForPatient(Patient patient) {
		patient.heal(10);
	}
	
	public void drawBlood (Patient patient) {
		patient.drawBlood(5);
	}

	public boolean isOperating() {

		return true;
	}


	

}
