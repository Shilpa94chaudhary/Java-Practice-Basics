package DynamicProgramming;

public class CountCubeSumPairs {

	public static int countCubeSumPairs(int n) {
		if(n==0) {
			return 0;
		}
		int count = 0;
		boolean isCounted = false;
		for(int i = 1; i*i*i <= n ; i++) {
			// if i^3 == n, then increase the count, this scenario will 
			// happens only once, sit covered the case B=0
			if(i*i*i == n) {
				count++;
			}
			// find the pair of A and B which give cube sum = n 
			for(int j=1; j*j*j <n ;j++) {
				if(i*i*i + j*j*j == n) {
					if(i != j) {
						count++;
					}else {
						if(isCounted == false) {
							isCounted = true;
							count++;
						}
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		System.out.println(countCubeSumPairs(9));
		System.out.println(countCubeSumPairs(27));

	}

}
