import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {
	
	Surgeon harry = new Surgeon ("Harry", "5555", "Brain", 120000, true);
	Patient patient = new Patient ("111", "Jeanne", 25, 25);
	
	
	@Test
	public void careForPatientShouldIncreasePatientHealth() {

		// Arrange
		int patientHealthBeforeCare = patient.getHealthLevel();

		// Act
		harry.careForPatient(patient);
		int patientHealthAfterCare = patient.getHealthLevel();

		// Assert
		assertThat(patientHealthAfterCare, equalTo(patientHealthBeforeCare + 10));
	}
	
	@Test
	public void calculateSalaryShouldReturnSalary () {
	
	//Arrange
	
	//Act
	int receptionistSalary = harry.calculatePay();
	
	//Assert
	assertThat(receptionistSalary, equalTo(120000));
	
	}
	
	@Test
	public void drawBloodShouldDecreasePatientBloodLevel() {
		
		int patientBloodLevelBeforeBloodDraw = patient.getBloodLevel();
		
		harry.drawBlood(patient);
		int patientBloodLevelAfterBloodDraw = patient.getBloodLevel();
		
		assertThat(patientBloodLevelAfterBloodDraw, equalTo(patientBloodLevelBeforeBloodDraw - 5));
	}
	
	@Test
	public void isOperatingShouldReturnTrue () {
		
		boolean isOnPhone = harry.isOperating();
		
		assertThat(isOnPhone, equalTo(true));
	}
	
	@Test
	public void shouldPassWhenToggleOperatingChangesValueofIsOperating () {
		
		Surgeon jeanne = new Surgeon("Jeanne", "1111", "Heart", 120000, false);
		
		boolean valueOfIsOperatingBeforeToggle = jeanne.isOperating();
		jeanne.toggleIsOperating();
		boolean valueOfIsOperatingAfterToggle = jeanne.isOperating();
		
		assertThat(valueOfIsOperatingAfterToggle, equalTo(!valueOfIsOperatingBeforeToggle));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
