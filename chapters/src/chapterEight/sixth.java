package chapterEight;

import java.util.Scanner;

public class sixth 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		
		if(num==0)
		{
			System.out.println(0);
		}
		else
		{
			binary(num);
		}
	}
	 public static void binary(int num)
	{
		if(num==0)
		return ;
		binary(num/2);
		System.out.print(num%2);
	}

}



