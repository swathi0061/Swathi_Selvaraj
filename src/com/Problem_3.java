package com;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value a");
		int a = scanner.nextInt();
		
		int limit = (a%2==0)? a-1 : a;
		
		int count = 0;
        int num = 1;
        while (count < limit) {
            System.out.print(num);
            count++;
            if (count < limit) {
                System.out.print(", ");
            }
            num += 2;
        }
	}
}
