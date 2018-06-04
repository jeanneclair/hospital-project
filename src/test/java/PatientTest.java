import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PatientTest {

	Patient patient = new Patient();
	
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
}
