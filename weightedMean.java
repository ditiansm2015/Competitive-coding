// Program to find weighted mean of a given integer array
// https://www.hackerrank.com/challenges/s10-weighted-mean/problem

import java.io.*;
import java.util.*;

public class Solution {

    public void weightedMean(int x[],int w[],int n)
    {
        for(int i=0;i<n;i++)
        {
            x[i]=x[i]*w[i];
        }
        int summationXW=0;
        int summationW=0;
        for(int i=0;i<n;i++)
        {
            summationXW=summationXW+x[i];
            summationW=summationW+w[i];
        }
        double weightedMean=(double)summationXW/summationW;
         System.out.printf("%.1f",weightedMean);
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];    
        int w[]=new int[n];
        Solution obj=new Solution();
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            w[i]=sc.nextInt();
        obj.weightedMean(x,w,n);
    }
}