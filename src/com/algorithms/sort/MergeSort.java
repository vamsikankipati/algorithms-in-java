package com.algorithms.sort;

public class MergeSort {

	public static int[] increasing(int[] arr) {
		int[] result = new int[arr.length];
		int q = arr.length / 2;
		System.out.println("q: " + q);
		int[] left = new int[q];
		int[] right = new int[q];
		for (int i = 0; i < q; i++) {
			left[i] = arr[i];
		}
		int k = 0;
		for (int j = q; j < arr.length; j++) {
			right[k] = arr[j];
			k += 1;
		}
		left = InsertionSort.increasing(left);
		right = InsertionSort.increasing(right);

		// Printing
		for (int e : left) {
			System.out.print(e);
		}
		System.out.println("\n");
		for (int e : right) {
			System.out.print(e);
		}
		System.out.println("\n");

		int i = 0;
		int j = 0;
		int s = 0;
		while ((i < left.length) && (j < right.length)) {
			if (left[i] <= right[j]) {
				result[s] = left[i];
				i++;
			} else {
				result[s] = right[j];
				j++;
			}
			s++;
		}
		while (i < left.length) {
			result[s] = left[i];
			i++;
			s++;
		}
		while (j < right.length) {
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
