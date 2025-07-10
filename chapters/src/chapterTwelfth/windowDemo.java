package chapterTwelfth;

public class windowDemo 
{
	public static void main(String[] args) 
	{
		window w1=new window(500, 600,cursorType.ARROW,windowColour.RED);
	
		w1.print();
	}

}
enum  cursorType
{
	ARROW,HAND,TEXT;
}
enum windowColour
{
	RED,BLUE,GRREN,OINK,YELLOW;
}
class window
{
	int height;
	int weight;
	cursorType ct;
	windowColour wc;
	
	public window(int height,int weight,cursorType ct,windowColour wc) 
	{
		this.height=height;
		this.weight=weight;
		this.ct=ct;
		this.wc=wc;
		
	}
	
	void print()
	{
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
		System.out.println("cursorType: "+ct);
		System.out.println("windowColour: "+wc);
	}
	
}

