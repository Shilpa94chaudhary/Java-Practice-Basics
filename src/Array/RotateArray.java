package Array;

public class RotateArray {

	static void rotateArr(int arr[], int d)
    {
		int n=arr.length;
        if(d>n){
            while(d>n){
                d=d-n;
            }
        }
    	int[] tempArr = new int[d];
    	for(int i = 0 ; i<d ; i++) {
    		tempArr[i]=arr[i];
    	}
    	for(int i=0 ; i<n-d ; i++) {
    		arr[i]=arr[i+d];
    	}
    	int j=0;
    	for(int i = n-d ; i<n ; i++) {
    		arr[i]=tempArr[j];
    		j++;
    	}
    }
	
	public static void printArray(int [] arr) {

		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr= {1, 3, 6, 2, 5, 4, 3, 2, 4};
//		printArray(arr);
		rotateArr(arr,2);
		printArray(arr);
		
		int[] arr1= {1, 3, 6, 2, 5, 4, 3, 2, 4};
//		printArray(arr1);
		rotateArr(arr1, 6);
		printArray(arr1);
	}

}
