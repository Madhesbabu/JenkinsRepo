package com.test.maddy;

import java.util.Arrays;
import java.util.Collections;

public class CodilityTestTwo {

	public static void main(String[] args) {
		
		int p[] = {4,4,2,4};
		int q[] = {5,5,2,5};
		
        Integer[] integerArray = Arrays.stream(q).boxed().toArray(Integer[]::new);
		Arrays.sort(integerArray, Collections.reverseOrder());
		
		int i = Arrays.stream(p).sum();
	    int temp = 0;
		for(int j = 0; j < integerArray.length; j++) {
			temp += integerArray[j];
			if(i <= temp) {
				System.out.println(j+1);
				break;
			}
		}
	}

}
