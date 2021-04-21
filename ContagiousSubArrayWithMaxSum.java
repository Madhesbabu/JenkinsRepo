package com.test.maddy;

public class ContagiousSubArrayWithMaxSum {

	public static void main(String[] args) {
		int[] A = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int ans = Integer.MIN_VALUE;
		System.out.println(ans);
		int l = A.length;
		for (int sub_arr_size = 1; sub_arr_size <= l; sub_arr_size++) {
			for (int start_index = 0; start_index < l; start_index++) {
				int sum = 0;
				if (start_index + sub_arr_size > l)
					break;
				for (int i = start_index; i < (start_index + sub_arr_size); i++) {
					sum += A[i];
				}
				ans = Math.max(ans, sum);
			}
		}
		System.out.println(ans);
	}
}
