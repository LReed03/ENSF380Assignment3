package edu.ucalgary.oop;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	private static int counter = 0;
	

	
	
	public DisasterVictim(String firstName, String ENTRY_DATE) {
		boolean validEntryDate = isValidDateFormat(ENTRY_DATE);
		if (validEntryDate == false){
			throw new IllegalArgumentException("Invalid date");
		}
		this.ENTRY_DATE = ENTRY_DATE;
		this.firstName = firstName;
		this.ASSIGNED_SOCIAL_ID = generateSocialID();
	}
	
	public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) throws IllegalArgumentException{
		int entryDateInt = convertDateStringToInt(ENTRY_DATE);
		int dateOfBirthInt = convertDateStringToInt(dateOfBirth);
		if(dateOfBirthInt > entryDateInt){
			throw new IllegalArgumentException("Cant have birthday after the entry date");
		}
		boolean validEntryDate = isValidDateFormat(ENTRY_DATE);
		if (validEntryDate == false){
			throw new IllegalArgumentException("Invalid date");
		}
		this.ENTRY_DATE = ENTRY_DATE;
		this.firstName = firstName;
		boolean validDOB = isValidDateFormat(dateOfBirth);
		if (validDOB == false){
			throw new IllegalArgumentException("Invalid date");
		}
		this.dateOfBirth = dateOfBirth;
		this.ASSIGNED_SOCIAL_ID = generateSocialID();
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
		boolean valid = isValidDateFormat(dateOfBirth);
		if(valid == false){
			throw new IllegalArgumentException("Not a valid DOB");
		}
		if(valid == true){
			this.dateOfBirth = dateOfBirth;
		}
		
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

	public String getGender() throws IllegalArgumentException{
		return this.gender;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	private static int generateSocialID(){
		// ID for first person is 2891
		int socialId = 2891 + counter;
		counter++;
		return socialId;
	}

	private static boolean isValidDateFormat(String date){
		String dateRegex = "^\\d{4}[-]{1}\\d{2}[-]\\d{2}$";
		Pattern myPattern = Pattern.compile(dateRegex);
		Matcher mymatcher = myPattern.matcher(date);
		if(mymatcher.find()){
			return true;
		}
		else{
			return false;
		}
		
	}

	private static int convertDateStringToInt(String dateStr){
		dateStr = dateStr.replace("-", "");
		int dateInt = Integer.parseInt(dateStr);
		return dateInt;
	}

}
