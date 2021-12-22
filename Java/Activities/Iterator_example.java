package fst_b17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an ArrayList
		List<String> listStrings = new ArrayList<String>();
		// Add values to it
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");

		//Create an Iterator
		Iterator<String> iterator = listStrings.iterator();

		// Use it to loop through the ArrayList
		while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		}

	}

}
