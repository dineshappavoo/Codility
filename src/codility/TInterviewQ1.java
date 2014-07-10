/**
 * 
 */
package codility;

/**
 * @author Dinesh Appavoo
 *
 */
public class TInterviewQ1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] A={10,0,8,2,-1,12,11,3};
		System.out.println(new TInterviewQ1().isAnagram("BBs$B$"));
	}
	
	public int isAnagram(String S)
	{
	    //To get the no of occurrences of each character and store it in their ASCII location
	    boolean isOddLength=false;
	    
	    char c;
	    //Array size 256 for ASCII
	    int[] strCountArr=new int[256];
	    for(int i=0;i<S.length();i++)
	    {
	        c=S.charAt(i); 
	        c=Character.toUpperCase(c);// If both the cases are considered to be the same
	        strCountArr[(int)c]++; //To increment the count in the character's ASCII location
	    }
	    for(int i=0;i<strCountArr.length;i++)
	    {
	    	
	    	if(!((strCountArr[i]&1)==0))
	    	{
	    		if(!isOddLength)
	    		{
	    			isOddLength=true;

	    		}else
	    		{
		    		return 0;

	    		}

	    	}
	    	else if(strCountArr[i]==1)
	    	{
	    		if(isOddLength)
	    		{
	    			return 0;
	    		}else
	    		{
	    			isOddLength=true;
	    		}
	    	}
	    }
	    return 1;
	}

	
}
