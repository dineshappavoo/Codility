/**
 * 
 */
package codility;

/**
 * @author Dany
 *
 */
public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A={3, 3, 3, 3, 3};
		System.out.println(new TestDemo().solution(A));

	}
	
    public int solution(int[] A) {
        // write your code in Java SE 7
    	long sum=0,currentSum=0,remSum=0;
		int N=A.length;
    	for(int i=0;i<N;i++)
    	{
    		sum+=A[i];
    	}
    	for(int j=0;j<N;j++)
    	{
    		remSum=0;
    		if(j==0||j==N-1)
			{
				if(sum-A[j]==0)
					return j;
			}else
			{
				currentSum+=A[j-1];
				remSum=(sum-(currentSum+A[j]));
				if(remSum==currentSum)
					return j;
			}	
    	}
    	return -1;
    	
    }

}
