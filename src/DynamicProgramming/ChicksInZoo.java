package DynamicProgramming;

public class ChicksInZoo {

	/*
	 * Initially, the zoo have a single chick. A chick gives birth to
	 * 2 chicks every day and the life expectancy of a chick is 6 days. 
	 * Zoo officials want to buy food for chicks so they want to know the 
	 * number of chicks on an Nth day. Help the officials with this task.
	 * For Input: 
	 * 10
	 * Your Output: 
	 * 19440
	 * Expected Output: 
	 * 19440
	 */
	
	public static long NoOfChicks(int N)
    {
        long[] []chicks = new long[N+1][2];
        chicks[1][0]=1; // New born chicks
        chicks[1][1]=1; // Total chicks
        
        for(int i = 2 ; i<= N ; i++) {
        	if(i>6) {
        		chicks[i][0] = (chicks[i-1][1] - chicks[i-6][0])* 2;
        		chicks[i][1] = chicks[i][0] + chicks[i-1][1] - chicks[i-6][0];
        	}else {
        		chicks[i][0] = chicks[i-1][1] * 2;
        		chicks[i][1] = chicks[i][0] + chicks[i-1][1];
        	}
        }
        return chicks[N][1];
    }
	
	public static void main(String[] args) {
		System.out.println(NoOfChicks(10));
	}

}
