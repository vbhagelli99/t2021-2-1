package Answers;

import java.util.Scanner;

public class Problem2 
{
	public static void main(String[] args) 
	{
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();

	for(int i=1; i<=num*2; i++)
	{
	if(i%2!=0)
	{
	System.out.print(i+",");
	}


	}

	}

}
