import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hospital {
	
	Scanner input = new Scanner(System.in);

	
	Map<String, Employee> employees = new HashMap<String, Employee>();
	
	Map<String, Patient> patients = new HashMap<String, Patient> ();
	
	public Collection<Employee> getAllEmployees() {

		return employees.values();
	}
	
	public Employee getAnEmployee(String name) {
		
		return employees.get(name);
	}
	
	//changing
	public void addEmployee(Employee employee) {
		
		employees.put(employee.getEmployeeNumber(), employee);
		
	}

	public void fireEmployee(Employee employee) {
		
		employees.remove(employee.getName(), employee);
	}
	
	public void addPatient(Patient patient) {
		
		patients.put(patient.getPatientID(), patient);
		
	}

	public void removePatientByID(String patientID) {

		patients.remove(patientID);
	}


	public Collection<Patient> getAllPatients() {
		return patients.values();
	}

	public int getEmployeeCount() {
		
		return employees.size();
		
	}
	
	public int getPatientCount() {
		
		return patients.size();
	}
	
	

}


