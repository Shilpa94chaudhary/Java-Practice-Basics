package Array;

public class SortArray012 {

	// Expected Time Complexity: O(N)
	// Expected Auxiliary Space: O(1)
	public static void sort012(int a[], int n)
	{
		int count0 =0, count1=0;
		for(int i=0; i<n;i++){
			if(a[i]==0) {
				count0 ++;
			}else if(a[i]==1) {
				count1 ++;
			}
		}
		for(int i=0; i<n ; i++) {
			if(count0 > 0) {
				a[i]=0;
				count0 --;
			}else if(count1 > 0) {
				a[i]=1;
				count1 --;
			}else {
				a[i]=2;
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {0,1,1,2,2,0,0};
		sort012(arr,7);
		for(int i=0; i<7 ; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
