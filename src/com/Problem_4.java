package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of array");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Enter Element " + (i+1));
			arr[i] = scanner.nextInt();
		}
		
		Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i == 0) {
                    count++;
                }
            }
            map.put(i, count);
        }

        System.out.println(map);
	}
}
