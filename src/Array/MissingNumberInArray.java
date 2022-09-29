package Array;

public class MissingNumberInArray {
	/*
	 * Given an array of size N-1 such that it only contains
	 * distinct integers in the range of 1 to N. Find the missing element.
	 * Example 1:
	 * Input:
	 * N = 5
	 * A[] = {1,2,3,5}
	 * Output: 4
	 * Expected Time Complexity: O(N)
	 * Expected Auxiliary Space: O(1)
	 */
	
	public static int MissingNumber(int array[], int n) {
		int sum = 0;
		for(int i=0; i<n-1;i++) {
			sum +=array[i];
		}
		
		return ((n * (n+1)/2) - sum);
    }
	
	public static int optimizedMissingNumber(int array[], int n) {
		
        for(int i=1; i<=n; i++) {
        	int j;
        	for(j=0; j<n-1;j++) {
        		if(array[j]==i)
        			break;
        	}
        	if(j==n-1) {
        		return i;
        	}
        }
        return 0;
    }
	public static void main(String[] args) {
		int A[] = {6,1,2,8,3,4,7,10,5};
		System.out.println(MissingNumber(A,10));
		
		int A1[] = {6,1,2,8,3,4,7,10,5};
		System.out.println(optimizedMissingNumber(A1,10));

	}

}
