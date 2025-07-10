package chapterEight;

import java.util.Scanner;

public class third 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=totalSum(sc,1);
		
		System.out.println("Sum of all: "+sum);
		
		
	}
	
	public static int totalSum(Scanner sc ,int count)
	{
		if(count > 5)
		{
			return 0;
		}
		else
		{
	    	System.out.println("Enter "+ count +" digit :");
			
			int digit=sc.nextInt();
			
			return digit+totalSum(sc,count+1);
		}
	}


}
