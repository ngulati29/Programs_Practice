import java.util.Scanner;

public class comparison {
	static int x,y;
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y = s.nextInt();
		comparison c=new comparison();
		int result= c.toCompare();
		System.out.println(result);
		s.close();
	}
	
	public int toCompare()
	{ 
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
}
