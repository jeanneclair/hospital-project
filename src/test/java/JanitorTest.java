import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JanitorTest {
	
	Janitor rosie = new Janitor ("Rosie", "3333", 40000, true);
	
	@Test
	public void calculateSalaryShouldReturnSalary () {
	
	//Arrange
	
	//Act
		int janitorSalary = rosie.calculatePay();
	
	//Assert
		assertThat(janitorSalary, equalTo(40000));
	
	}
	
	@Test
	public void isSweepingShouldReturnTrue () {
		
		boolean isSweeping = rosie.isSweeping();
		
		assertThat(isSweeping, equalTo(true));
		
	}

}
