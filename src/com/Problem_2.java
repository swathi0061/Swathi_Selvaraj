package com;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value a");
		int a = scanner.nextInt();
		
		for(int i=0;i<a;i++) {			
			System.out.print(2*i+1 +" ");
		}
	}
}
