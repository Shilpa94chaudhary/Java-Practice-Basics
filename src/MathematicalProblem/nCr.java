package MathematicalProblem;

public class nCr {

	//	public static int ncr(int n, int r) {
	//		if(r>n) {
	//			return 0;
	//		}
	//		if(n == r || n==n-r) {
	//			return 1;
	//		}
	//		int num=1;
	//		int deno=1;
	//		if(n-r >= r) {
	//			for(int i = n ; i> n-r ; i--) {
	//				num *= i;
	//			}
	//			for(int i=1 ; i<= r ; i++) {
	//				deno *= i;
	//			}
	//		}else {
	//			for(int i = n ; i>r ; i--) {
	//				num *= i;
	//			}
	//			for(int i=1 ; i<= n-r ; i++) {
	//				deno *= i;
	//			}
	//		}
	//		return num/deno;
	//	}
	public static int min(int x, int y){
		if(x <= y)
			return x;
		return y;
	}
	public static int ncr(int n, int r){
		int[] C = new int[r+1];
		for(int i = 0;i <= r;i++)
			C[i] = 0;
		// Top row of Pascal Triangle
		C[0] = 1; 

		// One by constructs remaining rows of Pascal 
		// Triangle from top to bottom 
		for(int i = 0;i <= n;i++){
			// Fill entries of current row using previous 
			// row values
			for(int j = min(i, r); j > 0; j--){
				// nCj = (n-1)Cj + (n-1)C(j-1);
				C[j] =(C[j] + C[j-1])%1000000007;
			}
		}
		return C[r]%1000000007;
	}

	public static void main(String[] args) {
		System.out.println(ncr(15,0));
		System.out.println(ncr(15,3));
		System.out.println(ncr(14,16));
		System.out.println(ncr(778, 116));


	}

}
