import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {
	
	Receptionist janine = new Receptionist ("Janine", "4444", 45000, true);
	
	@Test
	public void calculateSalaryShouldReturnSalary () {
	
	//Arrange
	
	//Act
	int receptionistSalary = janine.calculatePay();
	
	//Assert
	assertThat(receptionistSalary, equalTo(45000));
	
	}
	
	@Test
	public void isOnPhoneShouldReturnTrue () {
		
		boolean isOnPhone = janine.isOnPhone();
		
		assertThat(isOnPhone, equalTo(true));
	}

}
