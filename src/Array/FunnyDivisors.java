package Array;

import java.util.ArrayList;

public class FunnyDivisors {

	public static int findSum(int n, ArrayList<Integer> arr) {
		if(n==0) {
			return 0;
		}
		int sum = 0;
		for(int i = 0 ; i< arr.size(); i++) {
			System.out.println(arr.get(i));
			
			if(arr.get(i)%2 == 0|| arr.get(i)%3 == 0) {
				sum += arr.get(i);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0, 1);
		arr.add(1, 2);
		arr.add(2, 3);
		System.out.println(findSum(4,arr));
		
		
		arr.add(0, 7);
		arr.add(1, 5);
		arr.add(2, 11);
		arr.add(3, 3);
		arr.add(4, 5);
		arr.add(5, 2);
		arr.add(6, 9);
		System.out.println(findSum(7,arr));
	}

}
