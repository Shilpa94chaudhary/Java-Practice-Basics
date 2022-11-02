package Array;

import java.util.ArrayList;

public class EqualSum {

	// Incomplete program 
	/*
	 * Sample Input 1:
	 * 2
	 * 5
	 * 1 4 9 3 2
	 * 4
	 * 1 -2 5 -1
	 * Sample Output 1:
	 * 2
	 * 2
	 * Explanation For Sample Input 1:
	 * In the first test case, the token numbers are [1, 4, 9, 3, 2]. 
	 * If they meet at index 2, Alex will have token 0 and token 1, 
	 * with the sum = 1 + 4 = 5. Rome will have token 3 and token 5, 
	 * with the sum = 3 + 2 = 5. Hence, the sums are equal and the answer is 2.

	 * In the second test case, the token numbers are [1, -2, 5, -1]. 
	 * If they meet at index 2, Alex will have a sum of 1 + (-2) = -1, 
	 * and Rome will have a sum of -1. Hence, the answer is 2.
	 */
	
	public static int equalSum(ArrayList<Integer> token) {

		if(token.size()==0){
			return -1;
		}
		int token1 = 0;
		int token2 = 0;
		int N = token.size();
		for(int i = 0; i<N-1 ; i++){
			token1 += token.get(i);
			token2 = 0;
			for(int j = N-1 ; j>i+1 ; j--){
				token2+= token.get(j);
				if(token1 == token2){
					return i+1;
				}
			}

		}
		token1=0;
		token2=0;
		for(int i=0 ; i<N-1 ; i++){
			token1 += token.get(i);
		}
		if(token1 == 0){
			return N-1;
		}
		for(int j=N-1 ; j>0; j--){
			token2 +=token.get(j);
		}
		if(token2 == 0){
			return 0;
		}
		return -1;
	}

	public static void main(String[] args) {
		

	}

}
