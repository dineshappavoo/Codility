/**
 * 
 */
package codility;

import java.util.Arrays;

/**
 * @author Dinesh Appavoo
 *
 */
public class TInterviewQ3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A={10,0,8,2,-1,12,11,3};
		//int[] A={2};
		System.out.println(new TInterviewQ3().solution(A));
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		int N=A.length;
		int minValue=Integer.MAX_VALUE, maxValue=Integer.MIN_VALUE;
		int currentLimitIndex=0, currentMax=0,maxGap=Integer.MIN_VALUE;
		for(int i=0;i<N;i++)
		{
			if(A[i]<minValue)
			{
				minValue=A[i];
			}
			if(A[i]>maxValue)
			{
				maxValue=A[i];
			}
		}
		Arrays.sort(A);
		for(int j=0;j<N;j++)
		{
			if(j<=maxValue&&j>=minValue)
			{
				if(j<=A[currentLimitIndex])
				{
					if(j==0||j==N-1)
					{
						currentMax=Math.abs(j-A[currentLimitIndex]);
						if(currentMax>maxGap)
						{
							maxGap=currentMax;
						}
					}else 
					{
						currentMax=Math.min(Math.abs(A[currentLimitIndex-1]-j), Math.abs(j-A[currentLimitIndex]));
						if(currentMax>maxGap)
						{
							maxGap=currentMax;
						}
					}
				}else
				{
					if(currentLimitIndex<N)
						currentLimitIndex++;
				}
			}
		}

		return maxGap;
	}
}
