
public class Patient {
	
	private final int BLOOD_LEVEL = 20;
	private final int HEALTH_LEVEL = 10;
	
	private int bloodLevel = BLOOD_LEVEL;
	private int healthLevel = HEALTH_LEVEL;

	
	
	public Patient() {
		super();
	}


	public Patient(int bloodLevel, int healthLevel) {

		this.bloodLevel = bloodLevel;
		this.healthLevel = healthLevel;
	}


	public int getBloodLevel() {
		return bloodLevel;
	}


	public int getHealthLevel() {
		return healthLevel;
	}


	public void heal(int amountToHeal) {
		
		healthLevel += amountToHeal;
		}
		
		
		
	}
	
	

