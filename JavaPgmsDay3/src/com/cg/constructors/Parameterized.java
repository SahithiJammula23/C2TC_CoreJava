package com.cg.constructors;

public class Parameterized {
	int id;  
    String name;  
    
    //creating a parameterized constructor  
    Parameterized(int i,String n){  
        id = i;  
        name = n;  
        }  
    //method to display the values 
    
    void display(){
    	System.out.println(id+" "+name);
    	}  
   

	public static void main(String[] args) {
		
		//creating objects and passing values 
		
	    Parameterized student1 = new Parameterized(20,"Teju");  
	    Parameterized student2 = new Parameterized(32,"Lakshmi");  
	    
	    //calling method to display the values of object
	    
	    student1.display();  
	    student2.display();  
		
	}

}
