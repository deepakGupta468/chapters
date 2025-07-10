package chapterEight;

import java.util.Scanner;

public class eight 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How manny number u want to enter: ");
		int n=sc.nextInt();
		
		int [] nums=new int[n];
		System.out.println("Enter numbers: ");
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		int res=minimum(nums);
		System.out.println("Minimum value in all is: "+res);
	}
	
	public static int minimum(int[] nums)
	{
		int min=nums[0];
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] < min)
			{
				min=nums[i];
			}
		}
		return min;
	}



}
