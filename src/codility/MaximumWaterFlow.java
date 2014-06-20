/**
 * 
 */
package codility;

import java.util.ArrayList;

/**
 * @author Dany
 *
 */
public class MaximumWaterFlow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={2,5,1,3,1,2,1,7,7,6};
		System.out.println(new MaximumWaterFlow().solution(A));

	}

	public int solution(int[] A)
	{
		ArrayList<Integer> maxFlowList=new ArrayList<Integer>();
		int nextMinIndex=0, nextMaxIndex=0, currentPos;
		int N=A.length;
		int flowLength=0, flowHeight=0, flowSum=0,maxFlow=0;
		int nextMinTotal=0, nextMaxTotal=0, currentMaxFlow=0;
		currentPos=A[0];
		for(int i=0;i<N-1;i++)
		{
			currentPos=i;
			nextMinIndex=i;
			nextMaxIndex=i;
			flowLength=0;
			flowHeight=0;
			flowSum=0;
			maxFlow=0;
			nextMinTotal=0;
			nextMaxTotal=0;

			for(int j=i+1;j<A.length;j++)
			{
				if(A[j]<A[currentPos]&&(A[j]>A[nextMinIndex]))
				{
					if(nextMinIndex==i)  //Condition to find  immediate  next min index
					{
					nextMinIndex=j;
					}
				}else if(A[j]>A[currentPos]&&A[j]>A[nextMaxIndex])
				{
					if(nextMaxIndex==i)  //Condition to find immediate next max index
					{
					nextMaxIndex=j;
					}
				}
			}
			
			flowSum=0;
			nextMaxTotal=0;
			maxFlow=0;

			//For next Min 
			if(currentPos!=nextMinIndex&&nextMinIndex!=currentPos+1)
			{
				flowLength=nextMinIndex-currentPos-1;
				flowHeight=A[nextMinIndex];
				for(int k=currentPos+1;k<nextMinIndex;k++)
				{
					flowSum+=A[k];

				}
				maxFlow=flowLength*flowHeight;
				nextMinTotal=maxFlow-flowSum;
			}

			//For next Max 
			if(currentPos!=nextMaxIndex&&nextMaxIndex!=currentPos+1)
			{
				flowLength=nextMaxIndex-currentPos-1;
				flowHeight=A[currentPos];
				for(int l=currentPos+1;l<nextMaxIndex;l++)
				{
					flowSum+=A[l];

				}
				maxFlow=flowLength*flowHeight;
				nextMaxTotal=maxFlow-flowSum;
			}

			maxFlowList.add(nextMinTotal>nextMaxTotal?nextMinTotal:nextMaxTotal);
		}
		
		int maximumFlow=Integer.MIN_VALUE;
		for(int num : maxFlowList)
		{
			if(num>maximumFlow)
				maximumFlow=num;
		}
		return maximumFlow;
	}

}
