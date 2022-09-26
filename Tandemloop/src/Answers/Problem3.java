package Answers;

import java.util.Scanner;

public class Problem3 
{
	public static void main(String[] args) 
	{
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();
	if(num%2!=0)
	{
	for(int i=1; i<=num*2; i++)
	{
	if(i%2!=0)
	{
	System.out.print(i+"");
	}
	}

	}
	else
	{
	if(num%2==0)
	{
	num=num-1;
	for(int i=1; i<=num*2; i++)
	{

	if(i%2!=0)
	{
	System.out.print(i+",");
	}
	}
	}

	}

	}
}
