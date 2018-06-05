import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PatientTest {

	
	Patient patient = new Patient("111", "Jeanne Clair", 20, 20);

	
	@Test
	public void healShouldIncreasePatientHealth() {
		
		//Arrange
		int patientHealthBeforeHealing = patient.getHealthLevel();
		
		//Act
		patient.heal(5);
		int patientHealthAfterHealing = patient.getHealthLevel();
		
		//Assert
		assertThat(patientHealthAfterHealing, equalTo(patientHealthBeforeHealing + 5));
	}
	
	@Test
	public void drawingBloodShouldDecreasePatientBloodLevel () {
		
		int patientBloodLevelBeforeBloodDraw = patient.getBloodLevel();
		
		patient.bleed(5);
		int patientBloodLevelAfterBloodDraw = patient.getBloodLevel();
		
		assertThat(patientBloodLevelAfterBloodDraw, equalTo(patientBloodLevelBeforeBloodDraw - 5));
			
	}
	

	
	
}
