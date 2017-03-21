
public class interchange {
	public static void main(String[] args)
	{
		int a=2,b=3,t=0;
		System.out.println("No.'s before exchanging: "+a+" & "+b);

		t=a;
		a=b;
		b=t;
	
		System.out.println("No.'s after exchanging :"+a+" & "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("No.'s after exchanging without using third variable :"+a+" & "+b);

		
		
	}

}
