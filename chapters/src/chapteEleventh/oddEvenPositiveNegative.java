package chapteEleventh;

import java.util.Scanner;

public class oddEvenPositiveNegative 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How much elements u want to enter: ");
		int size=sc.nextInt();
		
		int[] n=new int[size];
		
		System.out.println("Enters the numbers: ");
		for(int i=0;i<=size-1;i++)
		{
			n[i]=sc.nextInt();
		}
		
		int evenRes=even(n);
		System.out.println("even:"+evenRes);
		
		int oddRes=odd(n);
		System.out.println("odd:"+oddRes);
		
		int positiveRes=positive(n);
		System.out.println("positive:"+positiveRes);
		
		int negativeRes=negative(n);
		System.out.println("negative:"+negativeRes);
	
		
	}
	
	public static int even(int[] arr)
	{
		int count=0;
		
		for(int element : arr)
		{
			if(element%2==0)
			{
				count++;
			}
		}
		return count;
	}
	public static int odd(int[] arr)
	{
		int count=0;
		
		for(int element : arr)
		{
			if(element%2!=0)
			{
				count++;
			}
		}
		return count;
	}
	public static int positive(int[] arr)
	{
		int count=0;
		
		for(int element : arr)
		{
			if(element > 0)
			{
				count++;
			}
		}
		return count;
	}
	public static int negative(int[] arr)
	{
		int count=0;
		
		for(int element : arr)
		{
			if(element < 0)
			{
				count++;
			}
		}
		return count;
	}


}
