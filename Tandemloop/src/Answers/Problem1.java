package Answers;

	import java.util.Scanner;

	public class Problem1 {

	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a");
	double a=scan.nextDouble();
	System.out.println("Enter b");
	double b=scan.nextDouble();
	System.out.println("TYPE add: for addition|| sub: for substraction|| mul: for multiplication|| div: for division");
	System.out.println("Enter operation to be performed");
	String s=scan.next();

	if(s.equals("add"))
	{
	System.out.println(a+b);
	}
	else if(s.equals("sub"))
	{
	System.out.println((a-b));
	}
	else if (s.equals("mul"))
	{
	System.out.println(a*b);
	}


	else if (s.equals("div"))
	{
	System.out.println(a/b);
	}
	else
	{
	System.out.println("Invalid input");
	}

	}

	}
