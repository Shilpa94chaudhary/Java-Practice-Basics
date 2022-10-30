package Array;

public class LongestMountainSubarray {

	public static int longestMountain(int a[], int n){

		if(a.length < 3) {
			return 0;
		}
		int i = 0, j = -1, k = -1, d = 0;

		for(i = 0; i < a.length - 1; i++){
			if (a[i + 1] > a[i]){
				if(k != -1){
					k = -1;
					j = -1;
				}
				if(j == -1)
					j = i;
			}else {
				if(a[i + 1] < a[i]){
					if (j != -1)
						k = i + 1;
					if (k != -1 && j != -1){
						if (d < k - j + 1)
							d = k - j + 1;
					}
				}else {
					k = -1;
					j = -1;
				}
			}
		}
		if(k != -1 && j != -1){
			if (d < k - j + 1)
				d = k - j + 1;
		}
		return d;
	}
	public static void main(String[] args) {
		
		int arr[] = {1,4,1,2,1};
		System.out.println(longestMountain(arr,5));

	}

}
