// Program to calculate first, second and third Quartile
// https://www.hackerrank.com/challenges/s10-quartiles/problem

import java.io.*;
import java.util.*;

public class Solution {
    
    public void quartile(int arr[],int l,int u,int count)
    {
        
        // if number of elements are even
        if((l+u)%2!=0)
        {
	  // count acts as base condition for the recursion
          count--;
          if(count>0)
          {
            	int mid=(arr[(l+u)/2]+arr[((l+u)/2)+1])/2;
            	int lengthL=((l+u)/2);  
            	quartile(arr,0,lengthL,count);
            	System.out.println(mid);
            	int lengthU=((l+u)/2)+1;
            	quartile(arr,lengthU,arr.length-1,count);
          }
        }
       
	// if number of elements are odd
        else
        {
	    // count acts as base condition for the recursion
            count--;
            if(count>0)
            {
            	int mid=arr[(l+u)/2];
            	int lengthL=((l+u)/2)-1;  
            	quartile(arr,0,lengthL,count);
            	System.out.println(mid);     
            	int lengthU=((l+u)/2)+1;
            	quartile(arr,lengthU,arr.length-1,count);
            }
        }   
   }
        

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner t=new Scanner(System.in);

	//taking input the  size of array
        int len=t.nextInt();

        int arr[]=new int[len];

	// taking array elements as input
        for(int i=0;i<len;i++)
        arr[i]=t.nextInt();
        
	// sorting array before calculating Quartile
        Arrays.sort(arr);

	//count keeps track of number of times recursion should take place
        int count=3;

        // l is lower limit for the array 
	int l=0;

	// u is upper limit for the array
        int u=arr.length-1;

        Solution obj=new Solution();
        obj.quartile(arr,l,u,count);
    }
}