package com.test.maddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OCATesting {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(-1, 4, 7, 2, -6);
		int b = 3;
		int suffixArr[] = new int[b];
		int j = 0;
		int sum1 = 0;
		int count = 0;
		int suffixSum = 0;
		int resultSum = 0;
		List<Integer> sumList = new ArrayList<>();
		for (int i = list.size() - 1; i > list.size() - b - 1; i--) {
			suffixArr[j] = list.get(i);
			suffixSum += suffixArr[j];
			j++;
		}
		sumList.add(suffixSum);
		int prefix = 0;
		for (int i = 0; i < b; i++) {
			prefix += list.get(i);
			if (i == b - 1) {
				sumList.add(prefix);
			} else {
				for (int k = 0; k < suffixArr.length - i - 1; k++) {
					count++;
					sum1 += suffixArr[k];
					if (count == b - i - 1) {
						sum1 += prefix;
						sumList.add(sum1);
						sum1 = 0;
						count = 0;
						break;
					}

				}
			}
		}
		resultSum =	sumList.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println(resultSum);
	}

}
