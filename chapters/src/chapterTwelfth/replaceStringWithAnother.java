package chapterTwelfth;

import java.util.Scanner;

public class replaceStringWithAnother 
{
	public static void main(String[] args) {
		String[] str= 
			{
					"We will teach you how to...",  
					   "Move a mountain",  
					   "Erase the past",  
					   "Make a million",  
					   "...all through Java!"
			};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string you have to searched: ");
		String str1=sc.nextLine();
		
		System.out.println("Enter the string u have to replaced: ");
		String str2=sc.nextLine();
		
		
		boolean found=false;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].contains(str1))
			{
				str[i]=str[i].replace(str1, str2);
				found=true;
			}
		}
		if(found)
		{
			System.out.println("Modified String: ");
			for(String s:str)
			{
				System.out.println(s);
			}	
		}
		else
		{
			System.out.println("String not found!!!");
		}
		
	}


}
