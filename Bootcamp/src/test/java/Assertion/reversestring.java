package Assertion;

public class reversestring {
	
	
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;

		System.out.println("I am going to print all the strings here  "+ a+b+c+d+e);
		
		//now I am creating an empty object
		int z;
		
		z=a;
		a=e;
		e=z;
		z=b;
		b=d;
		d=z;
		
		System.out.println("this is the reversed version  "+ a+b+c+d+e);
			
	}
}