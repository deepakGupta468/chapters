package chapterTwelfth;

import java.util.Arrays;
import java.util.Collections;

public class reverseAString 
{
	public static void main(String[] args) 
	{
		String []str= 
		{
				"To err is human...",  
				   "But to really mess things up...",  
				   "One needs to know Java!!"  
				
		};
		
		reversed(str);
		System.out.println(Arrays.toString(str));
		
	}
	 static void reversed(String[] str)
	{
		 Collections.reverse(Arrays.asList(str));
		
	}

}
