
public class Patient {
	
	private final int BLOOD_LEVEL = 20;
	private final int HEALTH_LEVEL = 10;
	
	private int bloodLevel = BLOOD_LEVEL;
	private int healthLevel = HEALTH_LEVEL;

	private String patientName;
	private String patientID;
	
	public Patient() {
		super();
	}

	public Patient(String patientID, String patientName, int bloodLevel, int healthLevel) {
		this.patientID = patientID;
		this.patientName = patientName;
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


	public void bleed(int amountToDraw) {

		bloodLevel -= amountToDraw;
	}

	public String getPatientID() {

		return patientID;
	}

	public String getPatientName() {
		return patientName;
	}
		
		
		
	}
	
	

