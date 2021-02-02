package com.algos.sort;

/**
 * Simplest one.
 */
public class Bubble {

	public static int[] increasing(int[] arr) {
		for (int i = 0; i < (arr.length - 1); i++) {
			for (int j = 0; j < (arr.length - i - 1); j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * Main method to test an example integer array
	 */
	public static void main(String[] args) {
		int[] ar = { 24, 452, 41, 246, 15, 10 };

		int[] res = increasing(ar);
		for (int element : res) {
			System.out.print(element + ",");
		}
	}
}
