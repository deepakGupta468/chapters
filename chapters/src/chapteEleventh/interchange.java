package chapteEleventh;

import java.util.Arrays;
import java.util.Scanner;

public class interchange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of array: ");
		int size=sc.nextInt();
		 
		int[] nums=new int[size];
		System.out.println("Enter "+size+" numbers: ");
		for(int i=0;i<=size-1;i++)
		{
			nums[i]=sc.nextInt();
		}
		
		swap(nums);
		
		System.out.println(Arrays.toString(nums));
		
	}
	public static void swap(int[] nums)
	{
		for(int i=0;i<nums.length-1;i+=2)
		{
			int temp=nums[i];
			nums[i]=nums[i+1];
			nums[i+1]=temp;
		}
	}


}
