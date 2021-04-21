package com.test.maddy;

import java.util.Arrays;
import java.util.Comparator;

public class TestingArrays {

	public static void main(String[] args) {
		
		int []a = new int[] {472, 663, 964, 722, 485, 852, 635, 4, 368};
		String []arr = new String[a.length];
		for(int i = 0; i < a.length; i++) {
			arr[i] = String.valueOf(a[i]);
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String a, String b) {
				return (b+a).compareTo(a+b);
			}
		});
		StringBuilder sb = new StringBuilder();
		for(String s : arr) {
			sb.append(s);
		}
		if(sb.charAt(0) == '0') {
			System.out.println(String.valueOf(0));
		}
		System.out.println(sb.toString());
		
	}

}
