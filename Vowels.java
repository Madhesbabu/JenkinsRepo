package com.test.maddy;

import java.util.Arrays;

public class Vowels {

	public static void main(String[] args) {

		String inputString = "bacdef";
		String []res = new String[256];
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) 
        {
            for (int j = i+1; j <= inputString.length(); j++) 
            {
                System.out.println(inputString.substring(i, j));
            }
        }
		
	}

}
