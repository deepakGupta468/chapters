package chapterEight;

public class fifth 
{
	public static void main(String[] args) 
	{
		int n=25;
		fabonic(n);
		
	}
	static void fabonic(int n)
	{
		int n1=1;
		int n2=1;
		
	
		//System.out.println(n2+" ");
		
		for(int i=0 ;i<=n;i++)
		{
			System.out.println(n1+" ");
			int n3=n2+n1;
			n1=n2;
			n2=n3;
			
		}
			
		
	}

}
