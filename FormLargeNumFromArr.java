package com.test.maddy;

import java.math.BigInteger;

public class FormLargeNumFromArr {

	public static void main(String[] args) {

		int []a = new int[] {472, 663, 964, 722, 485, 852, 635, 4, 368, 676, 319, 412};
		
		
		String temp1 = "";
		String temp2 = "";
		String first = String.valueOf(a[0]);
		for(int i = 1; i < a.length; i++) {
			temp1 = first + "" + a[i];
			temp2 = a[i] + "" + first;
			if(new BigInteger(temp1).compareTo(new BigInteger(temp2)) > 0) {
				first = first + a[i];
			}
			else {
				first = a[i] + first;
			}
		}
		System.out.println(first);
	}
}
