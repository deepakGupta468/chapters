package chapterTwelfth;

import java.util.Scanner;

public class deleteVowels 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str=sc.nextLine();
		
		
		String result=deleteVowel(str);
		System.out.println(result);
		
	}
	
	public static boolean isvowel(char c)
	{
		c=Character.toLowerCase(c);
		return  c=='a' || c=='e' || c=='i' || c=='o'|| c=='u' ;
	}
	
	public static String deleteVowel(String str)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i< str.length();i++)
		{
			char c=str.charAt(i);
			if(!isvowel(c))
			{
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
