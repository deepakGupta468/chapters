package chapteEleventh;

public class jaggedArray 
{
	public static void main(String[] args) 
	{
		int [][][] jagged=
			{
			{
					{1,2,3,4},
					{5,6,7},
					{8,9}
			},
			{
			        {10,11,12},
			        {13,14,15,16}
			}
			};
		
		System.out.println("First 2D array: ");
		System.out.println(jagged[0][0][0] +" " +jagged[0][0][1] +" "+jagged[0][0][2]+" "+jagged[0][0][3]);
		System.out.println(jagged[0][1][0] +" " +jagged[0][1][1] +" "+jagged[0][1][2]);
		System.out.println(jagged[0][2][0] +" " +jagged[0][2][1]);
		
		System.out.println("Second 2D array: ");
		System.out.println(jagged[1][0][0] +" " +jagged[1][0][1] +" "+jagged[0][0][2]+" "+jagged[1][0][2]);
		System.out.println(jagged[1][1][0] +" " +jagged[1][1][1] +" "+jagged[1][1][2]+" "+jagged[1][1][3]);
	}


}
