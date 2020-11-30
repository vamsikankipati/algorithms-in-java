package com.algos.sort;

public class MergeSort {

	public static final int THRESHOLD = 32;

	public static int[] increasing(int[] arr) {
		if (arr.length <= THRESHOLD) {
			return InsertionSort.increasing(arr);
		}

		int len1 = arr.length / 2;
		int[] left = new int[len1];
		for (int i = 0; i < len1; i++) {
			left[i] = arr[i];
		}
		int len2 = arr.length - len1;
		int[] right = new int[len2];
		for (int i = 0; i < len2; i++) {
			right[i] = arr[i + len1];
		}
		left = increasing(left);
		right = increasing(right);

		int[] result = new int[len1 + len2];
		int i = 0;
		int j = 0;
		int s = 0;
		while ((i < len1) && (j < len2)) {
			if (left[i] <= right[j]) {
				result[s] = left[i];
				i++;
			} else {
				result[s] = right[j];
				j++;
			}
			s++;
		}
		while (i < len1) {
			result[s] = left[i];
			i++;
			s++;
		}
		while (j < len2) {
			result[s] = right[j];
			j++;
			s++;
		}
		return result;
	}

	/**
	 * Main method to test an example integer array
	 */
	public static void main(String[] args) {
		int[] ar = { 18, 12, 11, 6, 55, 100 };
		int[] res = increasing(ar);
		for (int a : res) {
			System.out.print(a + " ");
		}
	}
}