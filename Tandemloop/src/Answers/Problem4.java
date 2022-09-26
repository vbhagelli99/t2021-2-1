package Answers;

import java.util.Scanner;

public class Problem4 
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("How many numbers are there?");
	int len=scan.nextInt();

	int a[]=new int[len];

	System.out.println("Enter the numbers");
	for(int i=0; i<=a.length-1; i++)
	{
	a[i]=scan.nextInt();

	}
	for(int num=1; num<=9; num++)
	{
	int count=0;
	for(int i=0; i<=a.length-1; i++)
	{
	if(a[i]%num==0)
	{
	count=count+1;
	}
	}
	System.out.print(num+":"+count+",");
	}
	}
}
