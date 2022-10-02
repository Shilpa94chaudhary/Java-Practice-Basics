package Array;

public class KadanesAlgorithm {

//	public static long maxSubarraySum(int arr[], int n){ 
//		if(n==0) {
//			return 0;
//		}
//		long subArrSum = Integer.MIN_VALUE;
//		for (int i = 0 ; i < n ; i++) {
//			for(int j=i ; j>=0 ; j--) {
//				long temp = 0;
//				for(int k = i ; k>=j ; k--) {
//					temp += arr[k];
//				}
//				if(temp>subArrSum) {
//					subArrSum = temp;
//				}
//			}
//		}
//		return subArrSum;
//	}
	
	
	// Optimized code
	
	public static long maxSubarraySum(int arr[], int n){ 
		if(n==0) {
			return 0;
		}
		long subArrSum = arr[0];
		for (int i = 1 ; i < n ; i++) {
			long temp = 0;
			for(int j=i ; j>=0 ; j--) {
				temp += arr[j];
				if(temp>subArrSum) {
					subArrSum = temp;
				}
			}
		}
		return subArrSum;
	}

	public static void main(String[] args) {

		int N = 5;
		int	Arr[] = {1,2,3,-2,5};
		System.out.println(maxSubarraySum(Arr,N));
		
		int N1 = 9;
		int Arr1[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSubarraySum(Arr1,N1));
		
	}

}
