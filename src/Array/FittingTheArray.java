package Array;

import java.util.Arrays;

public class FittingTheArray {
	public static boolean isFit (int arr[], int brr[], int n){
		Arrays.sort(arr);
	       Arrays.sort(brr);
	       for(int i=0 ; i<n ; i++){
	           if(arr[i]<= brr[i]){
	               continue;
	           }else{
	               return false;
	           }
	       }
	       return true;
	}
	
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5, 6, 7};
		int[] brr= {3, 4, 2, 6, 8, 9, 7};
		System.out.println(isFit(arr, brr, 7));
		
		int[] arr1= {3, 9, 3, 4, 5, 6, 7};
		int[] brr1= {3, 4, 2, 6, 8, 9, 7};
		System.out.println(isFit(arr1, brr1, 7));
	}

	/*
	 * 
	 * Input: arr[] = {7, 5, 3, 2},
	 * brr[] = {5, 4, 8, 7} and n = 4
	 * Output: YES
	 * Explanation:
	 * Transform arr[] = {2, 3, 5, 7} and
	 * brr[] = {4, 5, 7, 8}.
	 * Now, 2<=4, 3<=5, 5<=7 and 7<=8.
	 * So arr[] array will fit in brr[] array.
	 * 
	 * 
	 * Input: arr[] = {1, 2, 4},
	 * brr[] = {1, 2, 3} and n = 3 
	 * Output: NO
	 * Explanation: 
	 * As 1<=1, 2<=2 but 4>3 so, 
	 * arr[] array will not fit in brr[] array. 
	 * 
	 */
}
