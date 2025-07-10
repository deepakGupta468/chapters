package chapterEight;

import java.util.Scanner;

public class fourth 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a positive number: ");
		
		int num=sc.nextInt();
		
		System.out.println("prime number are: ");
		
		primeNumbers(num, 2);
		
	}
	
	public static void primeNumbers(int num, int divider)
	{
		if(num <= 1)
		{
			return;
		}
		if(num % divider == 0)
		{
			System.out.println(divider);
			primeNumbers(num/divider , divider);
		}
		else
		{
			primeNumbers(num, divider+1);
		}
	}

}


