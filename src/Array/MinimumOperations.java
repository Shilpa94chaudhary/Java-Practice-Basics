package Array;

public class MinimumOperations {

	public static int minimumOperation(int[] arr, int n) {
		if(arr.length <=1) {
			return 0;
		}
		int minCount = Integer.MAX_VALUE;
		for(int i = 0; i< arr.length ; i++) {
			int num = arr[i];
			int newCount=0;
			for(int j = 0; j< arr.length ; j++) {
				for(int k = 0; k<arr.length ; k++) {
					
					if(j == k) {
						continue;
					}
					
					if(arr[j]+arr[k] == num) {
						newCount++;
					}else if(arr[j]-arr[k] == num) {
						newCount++;
					}else if(arr[k]-arr[j] == num) {
						newCount++;
					}else if(arr[j]*arr[k] == num) {
						newCount++;
					}
					
					if(arr[j] != 1 && arr[k] != 1) {
						if(arr[j]/arr[k] == num) {
							newCount++;
						}else if(arr[k]/arr[j] == num) {
							newCount++;
						}
					}
					
				}
			}
			
			if(newCount < minCount) {
				minCount = newCount;
			}
			
		}
		
		return minCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
