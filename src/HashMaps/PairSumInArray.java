package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class PairSumInArray {

	public static int pairSum(int arr[], int s) {
		int count=0;
		Map <Integer,Integer> m = new HashMap<>();
		for(int i=0 ; i<arr.length ; i++) {
			if(m.containsKey(arr[i])) {
				m.put( arr[i], m.get(arr[i])+1 );
			}else {
				m.put(arr[i], 1);
			}
		}
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]==s-arr[i]) {
				count += m.get(s-arr[i])-1;
			}else if(m.containsKey(s-arr[i])  ) {
				count +=m.get(s-arr[i]);
			}
		}
		count = count/2;
		return count;
	}
	
	public static void main(String[] args) {
		Map <Integer,Integer> m = new HashMap<>();
		m.put(2, 1);
		System.out.println(m.get(2));
		m.put(2,m.get(2)+1);
		System.out.println(m.get(2));
		
		int[] arr= {1, 3, 6, 2, 5, 5, 4, 3, 2, 5, 5, 5};
		System.out.println(pairSum(arr,10));
		
		int[] arr2= {1, 3, 6, 2, 5, 5, 4, 3, 2, 4};
		System.out.println(pairSum(arr2,10));
		
		int[] arr1= {1, 3, 6, 2, 5, 4, 3, 2, 4};
		System.out.println(pairSum(arr1,12));
	}
}