package basic.practice;

import java.util.Scanner;

public class B11 {

//	Write a Java program to print the area and parameter of a circle.
//	Test Data:
//	Radius = 7.5 
//	Expected Output
//	Parameter is = 47.12388980384689 
//	Area is = 176.71458676442586
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Radius: ");
		double r = sc.nextDouble();
		
		double parameter = 2 * Math.PI * r;
		double area = Math.PI * r * r;
		
		System.out.println("Parameter is = " + parameter );
		System.out.println("Area is = " + area);
		
	}
	
}
