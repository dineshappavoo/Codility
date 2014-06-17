/**
 * 
 */
package codility;

import java.util.HashMap;

/**
 * @author Dany
 *
 */
public class MissingInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A={1,1};
		//int[] A={2};
		System.out.println(new MissingInteger().solution(A));
		//System.out.println(Integer.MIN_VALUE);
		//System.out.println(Integer.MIN_VALUE-1);

	}
	
	public int solution(int[] A) {
        // write your code in Java SE 7
		
		int length=A.length, startingNum,minValue=Integer.MAX_VALUE, missingNum=-1;
		HashMap<Integer, Boolean> hMap=new HashMap<Integer, Boolean>();
		//if(length==1)
			//return 1;
		for(int i=0;i<length;i++)
		{
			hMap.put(A[i], true);
			if(A[i]<minValue)
			{
				minValue=A[i];
			}
		}
		startingNum=minValue;
		for(int j=startingNum;j<=(startingNum+length);j++)
		{
			if(!hMap.containsKey(j))
			{
				missingNum = j;
				if(missingNum>0)
					break;
			}
		}
		if(missingNum==0||missingNum<0)
		return 1;
		return missingNum;
		
    }
}
