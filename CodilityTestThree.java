package com.test.maddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodilityTestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "id,name,age,score\n1,Jack,NULL,12\n17,Betty,28,11";
		String a[] = s.split("\n");
		List<String> extraArr = new ArrayList<>();
		extraArr.add(a[0]);
		for(int i = 1; i < a.length; i++) {
			List<String> innArr = Arrays.asList((a[i].split(",")));
			if(!innArr.contains("NULL")) {
				extraArr.add(a[i]);
			}
		}
		System.out.println(extraArr.toString());
	}

}
