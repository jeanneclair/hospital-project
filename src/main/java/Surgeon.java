
public class Surgeon extends Doctor implements CareForPatient, DrawBlood {

	private boolean isOperating;

	public Surgeon(String name, String employeeNumber, String specialty, int salary, boolean isOperating) {
	
		super(name, employeeNumber, specialty, salary); // don't quite get this.
		this.isOperating = isOperating;
	}
	
	public boolean isOperating() {

		return isOperating;
	}

	public void toggleIsOperating() {

		isOperating = !isOperating;
	}

	@Override
	public String toString() {
		return getName()+ "\t" + getEmployeeNumber()+ "\t" + getSpecialty()+ "\t" + isOperating();
	}

	
	

	

}
