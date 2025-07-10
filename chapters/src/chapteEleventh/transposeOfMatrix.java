package chapteEleventh;

import java.util.Scanner;

public class transposeOfMatrix 
{
	 public static void main(String[] args) 
     {
    	Scanner sc=new Scanner(System.in);
    	
    	int[][] matrix=new int[4][4];
    	int [][] transpose=new int[4][4];
    	
    	
    	System.out.println("Enter matrix: ");
    	for(int i=0;i<4;i++)
    	{
    		for(int j=0;j<4;j++)
    		{
    			matrix[i][j]=sc.nextInt();
    		}
    	}
    	
    	for(int i=0;i<4;i++)
    	{
    		for(int j=0;j<4;j++)
    		{
    			transpose[j][i]=matrix[i][j];
    		}
    	}
		
	 }
     public static void print(int[][] matrixx)
     {
    	 for(int i=0;i<4;i++)
    	 {
    		 for(int j=0;j<4;j++)
    		 {
    			 System.out.println(matrixx[i][j]);
    		 }
    		 System.out.println();
    	 }
     }


}
