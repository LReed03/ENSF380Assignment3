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
	private String comments;
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
		this.dateOfBirth = dateOfBirth;
	}

	public int getAssignedSocialID(){
		return this.ASSIGNED_SOCIAL_ID;
	}

	public FamilyRelation[] getFamilyConnections(){
		return this.familyConnections;
	}

	public MedicalRecord[] getMedicalRecords(){
		return this.medicalRecords;
	}
	public Supply[] getPersonalBelongings(){
		return this.personalBelongings;
	}

	public void setFamilyConnections(FamilyRelation[] connections){
		this.familyConnections = connections;
	}

	public void setMedicalRecords(MedicalRecord[] records){
		this.medicalRecords = records;
	}

	public void setPersonalBelongings(Supply[] belongings){
		this.personalBelongings = belongings;
	}

	public void addPersonalBelongings(Supply supply){

	}

	public void removePersonalBelongings(Supply unwantedSupply){

	}

	public void removeFamilyConnection(FamilyRelation exRelation){

	}

	public void addFamilyConnection(FamilyRelation relation){

	}

	public void addMedicalRecord(MedicalRecord record){

	}

	public String getEntryDate(){
		return this.ENTRY_DATE;
	}

	public String getComments(){
		return this.comments;
	}

	public void setComments(String comments){
		this.comments = comments;
	}

	public String getGender(){
		return this.gender;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	private static int generateSocialID(){
		// Temp
		return 0;
	}

	private static boolean isValidDateFormat(String date){
		// Temp
		return false;
		
	}

	private static int convertDateStringToInt(String dateStr){
		
	}

}
