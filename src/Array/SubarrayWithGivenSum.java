package Array;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
		int sum;
        for(int i=0; i<arr.length; i++){
            sum = arr[i];
            if(sum == s) {
            	numbers.add(i+1);
            	numbers.add(i+1); 
            	return numbers;
            }
            for(int j=i+1; j<arr.length;j++) {
            	sum += arr[j];
            	if(sum==s) {
            		numbers.add(i+1);
                	numbers.add(j+1);
                	return numbers;
            	}else if (sum > s)
            		break;
            	}
            }
        numbers.add(-1);
        return numbers;
    }
	
	public static void main(String[] args) {
		int N = 5, S = 12;
		int A[] = {1,2,3,7,5};
		ArrayList<Integer> numbers = subarraySum(A,N,S);
		System.out.println(numbers.get(0)+" "+numbers.get(1));
	}

}
