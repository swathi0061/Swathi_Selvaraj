package com;

import java.util.Scanner;

public class Problem_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("This is Calculator Application!!!");
		System.out.println("Enter Value a");
		double a = scanner.nextDouble();
		System.out.println("Enter Value b");
		double b = scanner.nextDouble();
		System.out.println("Enter Operator");
		String opr = scanner.next();
		double result = 0.0;
		switch (opr) {
		case "+":
			result = a + b;
			System.out.println(result);
			break;
		case "-":
			result = a - b;
			System.out.println(result);
			break;
		case "*":
			result = a * b;
			System.out.println(result);
			break;
		case "/":
			result = a / b;
			System.out.println(result);
			break;
		default:
			System.out.println("No such operation");
		}
	}
}
