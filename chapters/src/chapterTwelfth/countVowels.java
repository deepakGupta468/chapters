package chapterTwelfth;

import java.util.Scanner;

public class countVowels 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sentence: ");
		String str=sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<str.length()-1;i++)
		{
			char first=str.charAt(i);
			char second=str.charAt(i+1);
			if(isVowel(first) && isVowel(second))
			{
				System.out.println(""+first+second);
				count++;
			}
		}
		System.out.println(count);
		
		
	}
	
	static boolean isVowel(char c)
	{
		c=Character.toLowerCase(c);
		return c=='a' || c=='e' || c=='i' || c=='0' || c=='u';
	}
	

}
