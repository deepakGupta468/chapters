package chapterTwelfth;

import java.util.Scanner;

public class abbrevationsOfNames 
{
	public static void main(String[] args) 
	{
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter your full name: ");
	   String fullName=sc.nextLine().trim();
	   
	   String[] name=fullName.split(" ");
	   
	   StringBuilder sb=new StringBuilder();
	
	   for(int i=0;i<name.length-1;i++)
	   {
		   sb.append(Character.toUpperCase(name[i].charAt(0))).append(".");
	   }
	   if(name.length>0)
	   {
		   sb.append(name[name.length-1]);
	   }
	   System.out.println(sb);
	}

}
