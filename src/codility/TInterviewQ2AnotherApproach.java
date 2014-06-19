package codility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class TInterviewQ2AnotherApproach {

    public static void main(String[] args) {

        int[] inputArr = new int[1000000];
        //int[] inputArr = {5,4,0,3,1,6,2};
        File infile = new File("d:\\i.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(infile);
        
        
        
        int j = 0;
        while (scanner.hasNext()) {
            
                inputArr[j] = scanner.nextInt();
                j++;
            
        }
        if(inputArr.length==0) 
        {
            System.out.println("Empty array!");
            return;
        }
        System.out.println("Solution: "+solution(inputArr, 7));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    private static int solution(int[] inputArr, int n) {

        ArrayList<HashSet<Integer>> s = new ArrayList<HashSet<Integer>>(n);
        for(int j=0;j<n;j++)
        {
            s.add(new HashSet<Integer>());
        }
        
        int a;
        int max = 0;

        for(int i=0; i<n;i++)
        {
            a = inputArr[i];
            while(!s.get(i).contains(a))

            {
                s.get(i).add(a);
                a =inputArr[a];
            }
            if(max<s.get(i).size())
            {
                max = s.get(i).size();
            }
        }

        return max;
    }

}
