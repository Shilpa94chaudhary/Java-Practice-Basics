package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class TripletsSum {
	
//	public static int tripletSum(int[] arr, int s) {
//		Arrays.sort(arr);
//		int count = 0;
//		for(int i=0;i<arr.length-1;i++) {
//			int sum = s-arr[i];
//			HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
//			for(int j=i+1;j<arr.length;j++) {
//				if(map.containsKey(sum-arr[j])) {
//					for(int k=0;k<map.get(sum-arr[j]);k++) {
//						count ++;
//					}
//				}
//				if(map.containsKey(arr[j])) {
//					map.put(arr[j],map.get(arr[j]) + 1);
//				}else {
//					map.put(arr[j],1);
//				}
//			}
//		}
//		return count;
//	}

	public static int tripletSum(int[] arr, int s) {
		if(arr.length<3) {
			return 0;
		}
		
		
		int count = 0;
		int l = arr.length;
		
		// Copy array elements in Map
		Map <Integer, Integer> m = new HashMap <Integer, Integer>();
		for(int i=0; i<l; i++) {
			if(m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i])+1);
			}else {
				m.put(arr[i],1);
			}
		}
		
		for(int i=0 ; i<l ; i++) {
			for(int j = i+1 ; j<l ; j++) {
				int k = s - arr[i]-arr[j];
				if(m.containsKey(k)) {
					System.out.println("Count "+count);
					System.out.println(arr[i] + " " + arr[j] + " " + k);
					
					if(k == arr[i] && k == arr[j] && m.get(k) == 2) {
						continue;
					}else if(k == arr[i] && m.get(k) > 2) {
						count += m.get(k)-2;
						continue;
					}
					
					if(k == arr[i] && m.get(k) == 1) {
						continue;
					}else if(k == arr[i] && m.get(k) > 1) {
						count += m.get(k)-1;
						continue;
					}
					
					if(k == arr[j] && m.get(k) == 1) {
						continue;
					}else if(k == arr[j] && m.get(k) > 1) {
						count += m.get(k)-1;
						continue;
					}
					
					count += m.get(k);
				}
			}
		}
		
		count = count/3;
		
		return count;
	}

	/*
	 * 0 0 5
	 * 0 0 5
	 * 0 0 5
	 * 0 2 3
	 * 0 2 3
	 * 5
	 */
	
	public static void main(String[] args) {
		
//		int arr[]= {1,3,4,2,7,1,8,4};
//		System.out.println(tripletSum(arr,9));
		
//		int arr1[]= {1,3,4,2,7,3,8,3};
//		System.out.println(tripletSum(arr1,9));
		// Output: 4
		
//		int arr2[]= {3,3,4,2};
//		System.out.println(tripletSum(arr2,9));
		// Output: 2
		
//		int arr3[]= {1,3,5,7,1,3};
//		System.out.println(tripletSum(arr3,9));
		
		int arr[]= {6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0 };
		System.out.println(tripletSum(arr,5));
		
		}

}
