package chapteEleventh;

import java.util.Scanner;

public class numberOfElemennts 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[]n=new int[25];
		
		System.out.println("Enters 25 numbers: ");
		for(int i=0;i<=n.length-1;i++)
		{
			n[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number u want find the occurance: ");
		 int num=sc.nextInt();
		 
		 boolean found =isPresent(n, num);
		 if(found)
		 {
			 int count=occurence(n, num);
			 System.out.println("count:="+count);
		 }
		 else
		 {
			 System.out.println("Number not found!!!");
		 }
		
	}
	
	public static boolean isPresent(int[] arr , int target)
	{
		for(int element:arr)
		{
			if(element == target)
			{
				return true;
			}
		}
		return false;
	}
	
	public static int occurence(int[] arr ,int target)
	{
		int count=0;
		
		for(int element : arr)
		{
			if(element == target)
			{
				count++;
			}
		}
		return count;
	}


}
