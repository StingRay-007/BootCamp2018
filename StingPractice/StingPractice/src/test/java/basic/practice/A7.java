package basic.practice;

import java.util.Scanner;

public class A7 {

//	Write a Java program that takes a number as input and prints its multiplication table upto 10.
//	Test Data:
//	Input a number: 8
//	Expected Output :
//	8 x 1 = 8
//	8 x 2 = 16
//	8 x 3 = 24
//	...
//	8 x 10 = 80
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		int num1 = input.nextInt();
		
		for (int i=1; i<11; i++) {
		System.out.println(num1+" x "+i+" = "+(num1*i) );
				
		}
	}
	
}
