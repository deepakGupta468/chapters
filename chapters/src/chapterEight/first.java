package chapterEight;

import java.util.Scanner;

public class first 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		double a=sc.nextDouble();
		
		System.out.println("Enter Second Number:");
		double b=sc.nextDouble();
		
		double res=max(a,b);
		System.out.println("Result"+res);
		
	}
	
	public static double max(double a ,double b)
	{
		return (a > b)?a:b;
	}


}
