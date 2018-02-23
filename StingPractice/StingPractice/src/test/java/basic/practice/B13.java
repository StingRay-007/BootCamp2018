package basic.practice;

import java.util.Scanner;

public class B13 {

//	Write a Java program to print the area and parameter of a rectangle.
//	Test Data:
//	Width = 5.5 Height = 8.5
//	
//	Expected Output
//	Area is 5.6 * 8.5 = 47.60
//	Parameter is 2 * (5.6 + 8.5) = 28.20
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert width = ");
		double w = sc.nextDouble();
		
		System.out.println("Insert height = ");
		double h = sc.nextDouble();
		
		System.out.println("Area is ("+w+" * "+h+") = "+w*h);
		System.out.println("Parameter is 2*("+w+" + "+h+") = "+2*(w+h));
	}
	
}
