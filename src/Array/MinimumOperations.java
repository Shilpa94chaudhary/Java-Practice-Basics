package Array;

import java.util.HashMap;
import java.util.Set;

public class MinimumOperations {

	public static int minimumOperation(int[] arr,int n) {
		HashMap<Integer, Integer> hash = new HashMap<Integer,
				Integer>();

		for (int i=0; i<n; i++)
			if(hash.containsKey(arr[i]))
				hash.put(arr[i], hash.get(arr[i])+1);
			else hash.put(arr[i], 1);

		// find the max frequency
		int max_count = 0;
		Set<Integer> s = hash.keySet();

		for (int i : s)
			if (max_count < hash.get(i))
				max_count = hash.get(i);

		// return result
		return (n - max_count);
	}

	public static void main(String[] args) {

		int arr[] = {1,2,3,4};
		System.out.println(minimumOperation(arr,4));

		// Input: 1 1 3
		// Output: 
		int arr1[] = {1,1,3};
		System.out.println(minimumOperation(arr1,3));


	}

}
