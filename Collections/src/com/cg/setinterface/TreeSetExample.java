package com.cg.setinterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		//Create TreeSet object.
		TreeSet<String> treeSet = new TreeSet<String>();
		 
		//Add objects to the HashSet.
		treeSet.add("Teja");
		treeSet.add("Lakshmi");
		treeSet.add("Niharika");
		treeSet.add("Ramya");
		treeSet.add("Srija");
		treeSet.add("Pheebe");
		 
		//Print the TreeSet object.
		System.out.println("TreeSet elements:");
		System.out.println(treeSet);
		 
		//Print the TreeSet elements using iterator.
		Iterator<String> iterator=treeSet.iterator();
		System.out.println("\nTreeSet elements using iterator:");
		
		while(iterator.hasNext()){  
			
			System.out.println(iterator.next());  
			
		}  
		
	}
}