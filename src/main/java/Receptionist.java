
public class Receptionist extends Employee {

	private boolean isOnPhone;

	public Receptionist(String name, String employeeNumber, int salary, boolean isOnPhone) {
		super(name, employeeNumber, salary);
		this.isOnPhone = isOnPhone;

	}

	public boolean isOnPhone() {
		return isOnPhone;
	}

}
