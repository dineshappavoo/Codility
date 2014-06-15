/**
 * 
 */
package codility;

import java.util.Arrays;

/**
 * @author Dany
 *
 */
public class MaxCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A={2,214748364};
		//int[] A={2};
		int[] res=new MaxCounter().solution(1, A);
		for(int n:res)
		{
			System.out.print(" "+n);
		}
	}

	
	public int[] solution(int N, int[] A) {
        // write your code in Java SE 7
        int[] counter = new int[N];
        int maxValue=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<=N)
            {
                counter[A[i]-1]++;
                if(counter[A[i]-1]>maxValue)
                {
                	maxValue=counter[A[i]-1];
                }
            }else if(A[i]<=(N+1))
            {
            	Arrays.fill(counter, maxValue);
            }
        }
        
        return counter;
    }
}
