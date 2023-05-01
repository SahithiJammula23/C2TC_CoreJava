// A constructor in Java is a block of code, syntactically similar to a method that is used to initialize the state of an object in a class.
// Constructors are two types. Default and Parameterized

package com.cg.constructors;

public class Default {
	
	Default(){
		System.out.println("Default constructor is created");
	}
	
	//Constructor name must be the same as its class name
	//A Constructor must have no explicit return type
	//A Java constructor cannot be abstract, static, final, and synchronized

	public static void main(String[] args) {
		
		Default d = new Default(); //Calling a default constructor
		
		
	}

}
