package com.cc.java;

public class MA_Acc extends MA{

	public MA_Acc(String familyName, String firstName, int birthYear, String workID, String department, String role, int hiredYear) {
		super(familyName, firstName, birthYear, workID, department, role, hiredYear );
	}

	// Ausgabe --> accounting
	public String doYourWork() {
		return "Hi, I'm " + getFirstName() + " " + getFamilyName() + " and I'm checking a customer's account!";		
	}

}
