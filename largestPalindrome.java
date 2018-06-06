// program to find largest palindrome number
// https://www.hackerrank.com/contests/projecteuler/challenges/euler004

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int n;
    public void largePal(int n)
    {
        int flag1,factor1;
        for(int i=n;i>=100;i--)
        {
            flag1=palindrome(i);
            if(flag1==1)
            {
             factor1=factor(i);
             }
            else 
                continue;
            if((i%factor1==0)&&(i/factor1>=100)&&(i/factor1<=999))
            {
               System.out.println(i);
                break;
        }
    }
    }
    
    //finding palindrome
    public int palindrome(int i)
    {   
        int s=0;
        int j=i;
        while(i>0)
        {
            int r=i%10;
            s=s*10+r;
            i=i/10;
        }
        if(s==j)
            return 1;
        else return 0;
    }
    
    // finding if there exist any pair of three digits factor for the palindrome number
    public int factor(int i)
    {
        int k;
        for(k=100;k<1000;k++)
            if(i%k==0 && i/k>=100 && i/k<=999)
                break;
       // System.out.println(k);
        return k;
    }
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // t test cases
        int t = in.nextInt();
        int n[]=new int[t];
        for(int a0 = 0; a0 < t; a0++)
        {
            n[a0] = in.nextInt();
        }
        Solution obj=new Solution();
            for(int a0 = 0; a0 < t; a0++)
        {
            obj.largePal(n[a0]);
        }
    
        
    }
}