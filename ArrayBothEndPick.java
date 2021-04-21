package com.test.maddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBothEndPick {
	
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(-1, 4, 7, 2, -6);
		int b = 3;
		int resultSum = solve(list, b);
		System.out.println(resultSum);
	}
	
	public static int solve(List<Integer> A, int B) {
		Integer max = Integer.MIN_VALUE;

		int size = A.size();
		for (int i = 0; i <= B; i++) {
			int sum = 0;
			// sum start
			for (int start = 0; start < i; start++) {
				sum += A.get(start);
			}
			for (int end = 0; end < B - i; end++) {
				sum += A.get(size - 1 - end);
			}
			max = Math.max(max, sum);
		}

		return max;
	}

}
