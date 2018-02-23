package basic.practice;

public class B15 {

//	Write a Java program to swap two variables
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		int c;
		
		System.out.println("Before swap:" + " a=" + a + " , b="+ b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After swap:" + " a=" + a + " , b="+ b);
		
	}

}
