
public class Janitor extends Employee {

	private boolean isSweeping; 
	
	public Janitor(String name, String employeeNumber, int salary, boolean isSweeping) {
		
		super(name, employeeNumber, salary);
		this.isSweeping = isSweeping;
	
	}

	public boolean isSweeping() {
		return isSweeping;
	}
	
	

}
