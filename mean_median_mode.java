// program to calculate mean, median and mode in a given array
// https://www.hackerrank.com/challenges/s10-basic-statistics/problem

import java.io.*;
import java.util.*;

public class Solution {

   static int sum=0;
    public void stats(int arr[],int n)
    {
        double mean,median;
        int mode;
        //Mean
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        mean=(double)sum/n;
        System.out.println(mean);
        
        //Median
        Arrays.sort(arr);
        if(n%2==0)      //even number of elements
           median=(double)(arr[(n/2)-1]+arr[(n/2)])/2;
        else            //odd number of elements
           median=(double)(arr[n/2])/2;
        System.out.println(median);
            
        //mode
        HashMap hm = new HashMap();
        for(int i = 0; i < n; i++){
            if(hm.get(arr[i]) == null)
            {
                hm.put(arr[i], 1);
            } 
            else{
                int val = (int) hm.get(arr[i]);
                hm.put(arr[i], val + 1);
                }
        }
        int minCount = 0;
        mode = 0;
        for(int i = 0; i <n; i++){
            Object obj = hm.get(arr[i]);
            if((int) (obj) > minCount){
                mode = arr[i];
                minCount = (int) obj;
            }
        }
        System.out.println(mode);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        obj.stats(arr,n);
    }
    
}
