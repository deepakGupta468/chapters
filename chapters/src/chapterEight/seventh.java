package chapterEight;

import java.util.Scanner;

public class seventh 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		int res=naturalNumber(num);
		
		System.out.println(res);
		
	}
	static int naturalNumber(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return num+naturalNumber(num-1);
		}
	}



}
