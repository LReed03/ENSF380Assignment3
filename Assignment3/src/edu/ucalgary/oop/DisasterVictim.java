package edu.ucalgary.oop;

public class DisasterVictim {
	final String ENTRY_DATE;
	String firstName;
	String dateOfBirth;
	
	
	public DisasterVictim(String firstName, String ENTRY_DATE) {
		this.ENTRY_DATE = ENTRY_DATE;
		this.firstName = firstName;
	}
	
	public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) {
		this.ENTRY_DATE = ENTRY_DATE;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
	}
	
	String getFirstName() {
		return this.firstName;
	}
}
