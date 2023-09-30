package Array;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		// Add fruits to the the ArrayList
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add("Dragon Fruit");
		fruits.add("Guava");
		
		System.out.println(fruits);
		
		// Check if a fruit is present in the ArrayList or not, function will return in True or False
		System.out.println(fruits.contains("Raspberries"));
		
		// Remove a fruit from ArrayList
		System.out.println(fruits.remove("Banana"));
		
		System.out.println(fruits);
		
		// Clear complete ArrayList
		fruits.clear();
		
		System.out.println(fruits);
		

	}

}
