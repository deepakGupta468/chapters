package chapterEight;

import java.util.Scanner;

public class second 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double a=sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double b=sc.nextDouble();
		
		double res=min(a,b);
		
		System.out.println("Result: "+res);
		
		
	
		
	}
	
	public static double min(double a , double b)
	{
		return (a < b)? a:b;
		
	}


}
