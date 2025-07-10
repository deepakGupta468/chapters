package chapteEleventh;

import java.util.Arrays;
import java.util.Scanner;

public class copToAnother 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		
		int size=sc.nextInt();
		
		System.out.println("Enter "+size+" elements: ");
		
		int[] n=new int[size];
		for(int i=0;i<size;i++)
		{
			n[i]=sc.nextInt();
		}
		
		int[] reversed=copyAndReversed(n);
		
		System.out.println("Original Array: "+Arrays.toString(n));
		System.out.println("Reversed Array: "+Arrays.toString(reversed));
		
	}
	public static int[] copyAndReversed(int[] nums)
	{
		int[] newArray=new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			newArray[i]=nums[nums.length-1-i];
		}
		return newArray;
	}

}
