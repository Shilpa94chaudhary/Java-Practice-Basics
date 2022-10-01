package Array;

import java.util.Arrays;

public class TripletsSum {

	public static int tripletSum(int[] arr, int s) {
		if(arr.length<3) {
			return 0;
		}
		int len = arr.length;
		Arrays.sort(arr);
		int count = 0;
		int l,r;
		for(int i=0 ; i<len-2 ; i++) {
			l=i+1;
			r=len-1;
			int temp=0;
			boolean setValue=false;
			while(l<r) {
				if(arr[i]+arr[l]+arr[r]==s) {
					if(arr[r-1]==arr[r] && l!=r-1) {
						count++;
						if(setValue==false) {
							temp=r;
							setValue = true;
						}
						r--;
					}else if(setValue==true){
						r=temp;
						setValue=false;
						count++;
						l++;
					}else {
						count++;
						l++;
					}
				}else if(arr[i]+arr[l]+arr[r]>s) {
					r--;

				}else {
					l++;
				}
			}
		}
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

//		int arr[]= {6, 6, 5, 3, 2, 5, 0, 5, 0 ,5, -1};
//		System.out.println(tripletSum(arr,5));
//		
//		int arr1[]= {1, 2, 3, 4, 5, 6, 7 };
//		System.out.println(tripletSum(arr1,12));
		
		int arr2[]= {2,2,2,2};
		System.out.println(tripletSum(arr2,6));
		

		//		int arr1[]= {1,3,4,2,7,3,8,3};
		//		System.out.println(tripletSum(arr1,9));
		// Output: 4

		//		int arr2[]= {3,3,4,2};
		//		System.out.println(tripletSum(arr2,9));
		// Output: 2

		//		int arr3[]= {1,3,5,7,1,3};
		//		System.out.println(tripletSum(arr3,9));

		//		int arr[]= {6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0 };
		//		System.out.println(tripletSum(arr,5));

	}

}
