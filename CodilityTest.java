package com.test.maddy;

import java.util.ArrayList;

public class CodilityTest {

	public static void main(String[] args) {
		int arr[] = new int[] {1,1,1,3,4,5,6,7,5,6};
		ArrayList<Integer> outputArray = new ArrayList<>();
        //System.out.println("input arrays is " + Arrays.toString(arr));
        String s = "";
        for(int i = 0; i < arr.length; i++){
            s += arr[i];
        }
        //System.out.println("s " + s);
        int sum = Integer.parseInt(s) + 1;
        //System.out.println("Sum " + sum);
        String s2 = String.valueOf(sum);
        //System.out.println("s2 " + s2);
        for(int i = 0; i < s2.length(); i++){
            if(i == 0 && s2.charAt(0) == '0'){
                continue;
            }else{
                outputArray.add(Character.getNumericValue((s2.charAt(i))));
            }
        }
        if(outputArray.size() == 0)
            outputArray.add(1);
        //System.out.println(outputArray);
	}

}
