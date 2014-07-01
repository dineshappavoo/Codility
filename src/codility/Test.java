Evaluate an algebraic expression where the set of valid characters are +, -, x, =, 0-9.
example: x+x+4=x-5, find x

public class Main{
    
    public static int leftXCount=0;
    public static int rightXCount=0;

    public static int leftNumTotal=0;
    public static int rightNumTotal=0;
    public int findValue(String str)
    {
        int length=str.length();
        String left=str.substring(0,str.indexOf('='));
        String right=str.substring(str.indexOf('='),length-1);
        
        int xCount=0;
        
        
        
        for(int i=0;i<left.length();i++)
        {
            char c=left.charAt(i);
            if(c=='x')
            {
                leftXCount++;
            }else if(c=='+')
            {
                c=left.charAt(++i);
                {
                    if(c=='x')
                    {
                        leftXCount++;
                    }else
                    {
                    	leftNumTotal+=(int)c;
                    }
                }
                
            }else if(c=='-')
            {
                c=left.charAt(++i);
                {
                    if(c=='x')
                    {
                        leftXCount--;
                    }else
                    {
                        leftNumTotal-=(int)c;
                    }
                }
                
            }else
            {
                leftNumTotal+=(int)c;
            }
            
        }
        
        
    
    
    
            for(int i=0;i<right.length();i++)
        {
            char c=right.charAt(i);
            if(c=='x')
            {
                rightXCount++;
            }else if(c=='+')
            {
                c=right.charAt(++i);
                {
                    if(c=='x')
                    {
                        rightXCount++;
                    }else
                    {
                        rightNumTotal+=(int)c;
                    }
                }
                
            }else if(c=='-')
            {
                c=right.charAt(++i);
                {
                    if(c=='x')
                    {
                        rightXCount--;
                    }else
                    {
                        rightNumTotal-=(int)c;
                    }
                }
                
            }else
            {
                rightNumTotal+=(int)c;
            }
            
        }
        
        
        int totalXCount=leftXCount-rightXCount;
        int totalNumValue=rightNumTotal-leftNumTotal;
        int x=totalNumValue/totalXCount;
        
        return x;
        
        
    }
    }
    
    
   
}

What are some test cases?

-x+x-x-9-6=-x-x+x-7-x
-x+x-x-9-6
-x-x+x-7-x

0-0-0+0=0-0-1-x
x=-1
0-9=x
x=0
-1-1=

x=x