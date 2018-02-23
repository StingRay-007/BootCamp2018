package basic.practice;

import java.util.Scanner;

public class B12 {

	
//	Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1st number: ");
		double num1 = sc.nextInt();
		
		System.out.println("2nd number: ");
		double num2 = sc.nextInt();
		
		System.out.println("3rd number: ");
		double num3 = sc.nextInt();
		
		System.out.println("Average= "+(num1+num2+num3)/3);
		
	}

}
