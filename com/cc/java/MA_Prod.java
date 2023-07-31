package com.cc.java;

public class MA_Prod extends MA{

	public MA_Prod(String familyName, String firstName, int birthYear, String workID, String department, String role, int hiredYear) {
		super(familyName, firstName, birthYear, workID, department, role, hiredYear);
	}
	
	// Ausgabe --> production
	public String doYourWork() {
		return "Hi, I'm " + getFirstName() + " " + getFamilyName() + " and I'm assembling a car!";		
	}

	
}
