import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	Doctor phil = new Doctor("Phil", "1111", "Heart", 90000);
	Patient patient = new Patient ("111", "Jeanne", 25, 25);

	@Test
	public void careForPatientShouldIncreasePatientHealth() {

		// Arrange
		int patientHealthBeforeCare = patient.getHealthLevel();

		// Act
		phil.careForPatient(patient);
		int patientHealthAfterCare = patient.getHealthLevel();

		// Assert
		assertThat(patientHealthAfterCare, equalTo(patientHealthBeforeCare + 10));
	}
	
	@Test
	public void calculatePayShouldReturnDoctorSalary() {
		
		//Arrange
		
		
		//Act
		int doctorSalary = phil.calculatePay();
		
		//Assert
		assertThat(doctorSalary, equalTo(90000));
	}
	
	@Test
	public void drawBloodShouldDecreasePatientBloodLevel() {
		
		int patientBloodLevelBeforeBloodDraw = patient.getBloodLevel();
		
		phil.drawBlood(patient);
		int patientBloodLevelAfterBloodDraw = patient.getBloodLevel();
		
		assertThat(patientBloodLevelAfterBloodDraw, equalTo(patientBloodLevelBeforeBloodDraw - 5));
	}

}