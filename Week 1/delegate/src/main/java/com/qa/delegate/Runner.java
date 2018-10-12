package com.qa.delegate;

public class Runner {

	public static void main(String[] args) {

		Delegate d1 = new Delegate("jeff"); //new Delegate() constructor, this object will be immediatley destroyed, now Delegate stores the information from Delegate constructor!
		// d1 is the object created from the class
		
		d1.remove();
		
		
		
		Delegate aDifferentDelegate = new Delegate("Bert");
		
		aDifferentDelegate.changeStream();
		
		System.out.println(d1.name);
		
		d1.name = "Matt";
		
		System.out.println(d1.name);
		
		System.out.println(aDifferentDelegate.techSkills);
		
		aDifferentDelegate.techSkills = 9;
		
		System.out.println(aDifferentDelegate.techSkills);
		
		
		
	}

}
