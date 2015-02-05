package com.JessePetersonCIT360;

import org.quickconnectfamily.json.*;

public class Education {

	public static void main(String[] args) {
		// Create a PersonBean
		PersonBean aPerson = new PersonBean(1, "Jesse", "Peterson", 25);
		
		// Create an EducationBean
		EducationBean aEducation = new EducationBean("Idaho", "BYU-Idaho", "Computer Information Technology", 2015);
		
		System.out.println(aPerson.getFirstName() + " " + aPerson.getLastName() + " is currently attending " + 
		aEducation.getCollege() + " in " + aEducation.getState() + " and majoring in " + aEducation.getMajor() +
		" and is expecting to graduate in " + aEducation.getGradYear() + ".");
		
		//Starting null check
	}

}

/*public class Education {

	public static void main(String[] args) {
		// Create a PersonBean
		PersonBean aPerson = new PersonBean(1, "Jesse", "Peterson", 25);
		
		// Create an EducationBean
		EducationBean aEducation = new EducationBean("Idaho", "BYU-Idaho", "Computer Information Technology", 2015);
		
		System.out.println(aPerson.getFirstName() + " " + aPerson.getLastName() + " is currently attending " + 
		aEducation.getCollege() + " in " + aEducation.getState() + " and majoring in " + aEducation.getMajor() +
		" and is expecting to graduate in " + aEducation.getGradYear() + ".");
	}

}*/
