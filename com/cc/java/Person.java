package com.cc.java;

public class Person {

    private String familyName;
	private String firstName;
	private int birthYear;

    public Person(String familyName, String firstName, int birthYear) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    //-----------------  Methoden Getter / Setter --------------//	

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getBirthYear() {
		return birthYear;
	}

    //-----------------  Methoden  --------------//	
	protected String getPersonalData() {
		return "Hi, I'm " + firstName + " " + familyName + " & I was born in "+  birthYear + ".";		
	}


    
}
