package fst_b17;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String args[]) {
	    
		ArrayList<String> myList = new ArrayList<String>();
		
		//Add 5 names to the ArrayList
		myList.add("Ajay");
		myList.add("Kiran");
		myList.add("Chaman");
		myList.add("Samar");
		myList.add("Gaman");
		
		//print all the names using for loop
		for(String name:myList)
			System.out.println(name);
		
		System.out.println("Third name in myList: " + myList.get(2)); //3rd name in myList
		System.out.println("Does myList contain 'Ajay'? " + myList.contains("Ajay")); //check if a name exists in the ArrayList
		System.out.println("No. of elements in myList: " + myList.size()); //print the number of names in the ArrayList
		
		//remove a name from the list and print the size() of the list again
		myList.remove("Samar");
		System.out.println("No. of elements in myList: " + myList.size());
	}
}
