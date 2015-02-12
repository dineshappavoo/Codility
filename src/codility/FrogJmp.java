/**
 * 
 */
package codility;

/**
 * @author Dinesh Appavoo
 *
 */
public class FrogJmp {

	/**
	 * @param args
	 * 
	 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
		Count the minimal number of jumps that the small frog must perform to reach its target.
		Write a function:
		class Solution { public int solution(int X, int Y, int D); }
		that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
		For example, given:
		  X = 10
		  Y = 85
		  D = 30
		the function should return 3, because the frog will be positioned as follows:
		after the first jump, at position 10 + 30 = 40
		after the second jump, at position 10 + 30 + 30 = 70
		after the third jump, at position 10 + 30 + 30 + 30 = 100
		Assume that:
		X, Y and D are integers within the range [1..1,000,000,000];
		X ² Y.
		Complexity:
		expected worst-case time complexity is O(1);
		expected worst-case space complexity is O(1).

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new FrogJmp().solution2(10, 85, 30));
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);

	}


	public int solution(int X, int Y, int D) {
		// write your code in Java SE 7
		int wholeValue;
		if(X==Y)
			return 0;
		wholeValue=(int) Math.ceil((double)(Y-X)/D);
		return wholeValue;


	}
	// you can also use imports, for example:
	// import java.util.*;

	// you can use System.out.println for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	public int solution1(int X, int Y, int D) {
		// write your code in Java SE 8

		int distance=Y-X;
		if(distance==0)
			return 0;
		if(distance<=D)
			return 1;
		int noOfJumps=distance/D;
		int modVal=distance%D;
		if(modVal>0)
			noOfJumps+=1;
		return noOfJumps;     
	}

	public int solution2(int X, int Y, int D)
	{
		if (X>=Y)
			return 0;
		double noOfJumps = Math.ceil((double)(Y-X)/D);
		System.out.println(noOfJumps);
		return (int)noOfJumps;

	}
}
