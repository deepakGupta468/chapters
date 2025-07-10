package chapterTwelfth;

import java.util.Scanner;

public class removeThe 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
		
		StringBuilder sb=new StringBuilder();
		String[] word=str.split(" ");
		
		for(String s: word)
		{
			if(!s.equalsIgnoreCase("the"))
			{
				sb.append(s).append(" ");
			}
		}
		
		System.out.println(sb.toString().trim());
		
	}

}
