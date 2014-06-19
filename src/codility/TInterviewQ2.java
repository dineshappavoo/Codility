/**
 * 
 */
package codility;

import java.util.Set;
import java.util.TreeSet;


 
/* Name of the class has to be "Main" only if the class is public. */
class TInterviewQ2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a = {0,1,2,5,4,3,6,9,8,7,10,12,11};
		System.out.println( solution(a) );
	}
 
	static int solution( int[] A){
		
		int n=A.length;
		Set<Integer> s = new TreeSet<Integer>();
		for(int i=0; i<n; i++)
		{
		   s = createSetFor( A, i, s );
		}
		return s.size();
	}
 
	static Set<Integer> createSetFor( int[] a, int k, Set<Integer> s ){
		int i = a[k];
		Set<Integer> temp = new TreeSet<Integer>();
		while( !s.contains(i) ){
			if( temp.contains(i) ){
				if(temp.size()>s.size()){
					s=temp;
					return s;
				}
				return s;
			}
			temp.add(i);
			i=a[i];
		}
		s.addAll(temp);
		return s;
	}
}