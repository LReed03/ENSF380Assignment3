package edu.ucalgary.oop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		personalBelongings = Arrays.copyOf(personalBelongings, personalBelongings.length + 1);
		personalBelongings[personalBelongings.length - 1] = supply;
	}

	public void removePersonalBelongings(Supply unwantedSupply){
		List<Supply> tempList = new ArrayList<>(Arrays.asList(personalBelongings));
		tempList.remove(unwantedSupply);
		personalBelongings = tempList.toArray(new Supply[0]);
		
	}

	public void removeFamilyConnection(FamilyRelation exRelation){
		List<FamilyRelation> tempList = new ArrayList<>(Arrays.asList(familyConnections));
		tempList.remove(exRelation);
		familyConnections = tempList.toArray(new FamilyRelation[0]);
	}

	public void addFamilyConnection(FamilyRelation relation){
		familyConnections = Arrays.copyOf(familyConnections, familyConnections.length + 1);
		familyConnections[familyConnections.length - 1] = relation;
	}

	public void addMedicalRecord(MedicalRecord record){
		medicalRecords = Arrays.copyOf(medicalRecords, medicalRecords.length + 1);
		medicalRecords[medicalRecords.length - 1] = record;
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
