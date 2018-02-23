package basic.practice;

public class A4 {

//	Write a Java program to print the result of the following operations.
//	Test Data:
//	a. -5 + 8 * 6
//	b. (55+9) % 9 
//	c. 20 + -3*5 / 8 
//	d. 5 + 15 / 3 * 2 - 8 % 3 
//	Expected Output :
//	43 
//	1 
//	19 
//	13
	
	static int a2 = 2;
	static int a3 = 3;
	static int a5 = 5;
	static int a6 = 6;
	static int a8 = 8;
	static int a9 = 9;
	static int a15 = 15;
	static int a20 = 20;
	static int a55 = 55;
	static int b = a55 + a9;
	static int d = a8 % a3;
	
	public static void main(String[] args) {
		System.out.println(-a5 + a8 * a6);
		System.out.println(b % a9);
		System.out.println(a20 + -a3 * a5 / a8);
		System.out.println(a5 + a15 / a3 * a2 - d);
	}
	
	
}
