package chapteEleventh;

import java.util.Scanner;

public class distanceOfTwoPoints 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		double[]x=new double[10];
		double[]y=new double[10];
		
		System.out.println("Enter x and y cooedinates: ");
		{
			for(int i=0;i<10;i++)
			{
				x[i]=sc.nextDouble();
				y[i]=sc.nextDouble();
			}
			
			int sum=0;
			for(int i=0;i<9;i++)
			{
				double dx=x[i+1]-x[i];
				double dy=y[i+1]-y[i];
				
				double distance=Math.sqrt(dx*dx+dy*dy);
				sum+=distance;
			}
			System.out.println("Distnace: "+sum);
		}
		
		
		
	}


}
