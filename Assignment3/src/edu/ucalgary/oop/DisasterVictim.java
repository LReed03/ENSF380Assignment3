package edu.ucalgary.oop;

public class DisasterVictim {
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private int ASSIGNED_SOCIAL_ID;
	private FamilyRelation[] familyConnections;
	private MedicalRecord[] medicalRecords;
	private Supply[] personalBelongings;
	private final String ENTRY_DATE;
	private String gender;
	private String Comments;
	private static int counter;
	

	
	
	public DisasterVictim(String firstName, String ENTRY_DATE) {
		this.ENTRY_DATE = ENTRY_DATE;
		this.firstName = firstName;
	}
	
	public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) throws IllegalArgumentException{
		this.ENTRY_DATE = ENTRY_DATE;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getDateOfBirth(){
		return this.dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException{
		// Either throw the exception in only the setter and use the setter in constructor or throw the exception everytime it is set
		this.dateOfBirth = dateOfBirth;
	}

}
