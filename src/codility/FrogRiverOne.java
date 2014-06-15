/**
 * 
 */
package codility;

import java.util.Arrays;

/**
 * @author Dany
 *
 */
public class FrogRiverOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A={1};
		//int[] A={2};
		System.out.println(new FrogRiverOne().solution(1, A));
	}

	public int solution(int X, int[] A) {
		// write your code in Java SE 7
		int maxMin=Integer.MIN_VALUE;
		int length=A.length;
		int[] iCheck=new int[X];
		Arrays.fill(iCheck, -1);
		for(int i=0;i<length;i++)
		{
			if(iCheck[A[i]-1]==-1)
			{
				iCheck[A[i]-1]=i;
			}
		}
		
		for(int j=0;j<X;j++)
		{
			if(iCheck[j]==-1)
			{
				return -1;
			}else if(iCheck[j]>maxMin)
			{
				maxMin=iCheck[j];
			}
		}
		
		return maxMin;
	}

}
