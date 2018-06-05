import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import javax.net.ssl.HostnameVerifier;

import org.junit.Test;

public class HospitalTest {
	
	Hospital hospital = new Hospital();
	Patient patient1 = new Patient("111", "TestPatient", 20, 20);
	
	@Test  //passed
	public void shouldPassWhenGetAllEmployeesReturnsSize() {
		
		Doctor employee = new Doctor ("Dr Jeanne", "1111", "brain", 80000);
		hospital.addEmployee("Dr Jeanne", employee);
		hospital.getAllEmployees();
		
		assertThat(1, equalTo(hospital.getAllEmployees().size()));
	}
	
	@Test //passed
	public void shouldPassWhenGetAddEmployeeReturnsSize() {

		Doctor employee = new Doctor ("Dr Jeanne", "1111", "brain", 80000);
		hospital.addEmployee("Dr Jeanne", employee);
		
		assertThat(1, equalTo(hospital.getAllEmployees().size()));
		
	}
	
	@Test //passed
	public void shouldPassWhenFireEmployeeReturnsSize () {
		
		Doctor employee = new Doctor ("Dr Jeanne", "1111", "brain", 80000);
		hospital.addEmployee("Dr Jeanne", employee);
		hospital.fireEmployee(employee);
		
		assertThat(0, equalTo(hospital.getAllEmployees().size()));
		
	}
	
	@Test
	public void shouldPassWhenReturnAllEmployeesWhoCanDrawBlood () {
		
		int employeesWhoCanDrawBlood = 0;
		
		Doctor Jeanne = new Doctor ("Jeanne", "1111", "brain", 80000);
		hospital.addEmployee("Jeanne", Jeanne);
		Surgeon Clair = new Surgeon ("Clair", "2222", "heart", 120000, true);
		hospital.addEmployee("Clair", Clair);
		
		for (Employee employee : hospital.getAllEmployees()) {
			
			if (employee instanceof DrawBlood) {
				
				++employeesWhoCanDrawBlood;
				
			}
			
		}
		
		assertThat(employeesWhoCanDrawBlood, equalTo(2));
	}
	
	@Test
	public void shouldPassWhenReturnAllEmployeesWhoCanCareforPatient () {
		
		int employeesWhoCanCareForPatients = 0;
		Doctor Jeanne = new Doctor ("Jeanne", "1111", "brain", 80000);
		hospital.addEmployee("Jeanne", Jeanne);
		Surgeon Clair = new Surgeon ("Clair", "2222", "heart", 120000, true);
		hospital.addEmployee("Clair", Clair);
		Nurse Marie = new Nurse ("Marie", "3333", 5, 50000);
		hospital.addEmployee("Marie", Marie);
		
		for (Employee employee : hospital.getAllEmployees()) {
			
			if (employee instanceof CareForPatient) {
				
				++employeesWhoCanCareForPatients;
				
			}
			
		}
		
		assertThat(employeesWhoCanCareForPatients, equalTo(3));
		
		
	}
	
		@Test
		public void shouldPassIfRemovePatientByID () {
			
			hospital.addPatient(patient1);
			int sizeBeforeRemovePatient = hospital.patients.size();
			
			hospital.removePatientByID("111");
			int sizeAfterRemovePatient = hospital.patients.size();
			

			assertThat(sizeAfterRemovePatient, equalTo(0));
		}
		

}















