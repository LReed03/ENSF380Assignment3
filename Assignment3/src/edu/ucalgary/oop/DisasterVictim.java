package edu.ucalgary.oop;
import java.util.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class DisasterVictim {
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private int ASSIGNED_SOCIAL_ID;
   	private List<FamilyRelation> familyConnections;
    private List<MedicalRecord> medicalRecords;
    private List<Supply> personalBelongings;
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

	public List<FamilyRelation> getFamilyConnections(){
		return this.familyConnections;
	}

	public List<MedicalRecord> getMedicalRecords(){
		return this.medicalRecords;
	}
	public List<Supply> getPersonalBelongings(){
		return this.personalBelongings;
	}

	public void setFamilyConnections(List<FamilyRelation> connections){
		this.familyConnections = connections;
	}

	public void setMedicalRecords(List<MedicalRecord> records){
		this.medicalRecords = records;
	}

	public void setPersonalBelongings(List<Supply> belongings){
		this.personalBelongings = belongings;
	}

	public void addPersonalBelongings(Supply supply){
		personalBelongings.add(supply);
	}

	public void removePersonalBelongings(Supply unwantedSupply){
		personalBelongings.remove(unwantedSupply);
	}

	public void removeFamilyConnection(FamilyRelation exRelation){
		familyConnections.remove(exRelation);
	}

	public void addFamilyConnection(FamilyRelation relation){
		familyConnections.add(relation);
	}

	public void addMedicalRecord(MedicalRecord record){
		medicalRecords.add(record);
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
		Pattern myPattern = Pattern.compile("");
		// use Regex for this function
		Matcher mymatcher = myPattern.matcher(date);
		// Temp
		return false;
		
	}

	private static int convertDateStringToInt(String dateStr){

	}

}
