// program to find standard deviation of a given set of numbers
// https://www.hackerrank.com/challenges/s10-standard-deviation/problem

import java.io.*;
import java.util.*;

public class Solution {
    
    static double sum=0.0;
    public void standDev(int arr[],int n)
    {
        // Mean
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        double mean=sum/n;
        
        //array to store squares of elements of arr[]
        double sqArray[]=new double[n];
        
        //squared distance from the mean
        for(int i=0;i<n;i++)
        {
            double diff=arr[i]-mean;
            sqArray[i]=Math.pow(diff,2);
        }
        
        sum=0;
         for(int i=0;i<n;i++)
        {
            sum=sum+sqArray[i];
        }
        
        double sdSquare=sum/n;
        double sd=Math.sqrt(sdSquare);
        
        //printing standard deviation upto one decmal place
        System.out.printf("%.1f",sd);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        obj.standDev(arr,n);
    }
}