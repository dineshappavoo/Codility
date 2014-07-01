/**
 * 
 */
package prefixsum;

import java.util.Arrays;


/**
 * @author Dany
 *
 */
public class PrefixSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int A[]={3,2,1,4,5};
		int[] P=new PrefixSum().findPrefixSum(A);
		System.out.println(new PrefixSum().findPrefixSumValue(P, 1, 3));
	}
	
	public int[] findPrefixSum(int[] A)
	{
		int n=A.length;
		int[] P=new int[n+1];
		Arrays.fill(P, 0);
		for(int i=1;i<n+1;i++)
		{
			P[i]=P[i-1]+A[i-1];
		}
		return P;
	}
	
	public int findPrefixSumValue(int[] P, int x, int y)
	{
		return (P[y+1]-P[x]);
	}

}
