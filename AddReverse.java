// Program to reverse two numbers, add them and again reverse the numbers
// http://www.spoj.com/problems/ADDREV/

import java.util.*;

class AddReverse
{

	public void addReverse(int num1,int num2)
	{
		int rNum1=reverse(num1);
		int rNum2=reverse(num2);
		int sum=rNum1+rNum2;
		int rSum=reverse(sum);
		System.out.println(rSum);
	}
	public int reverse(int num)
	{
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		return sum;
	}
	
	public static void main(String arg[])
	{
		int num1,num2;
		AddReverse obj=new AddReverse();
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int i=1;i<=testCase;i++)
		{
			num1=sc.nextInt();
			num2=sc.nextInt();
			obj.addReverse(num1,num2);
		}
	}
}
		