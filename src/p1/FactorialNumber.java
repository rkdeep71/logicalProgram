package p1;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int fact = 1;

		for (int i = number; i >= 1; i--) {
			fact = fact * i;

		}
		System.out.println("Factorial of " + number + " is " + fact);
		
		System.out.println("Rahul kumar");
	}
}
