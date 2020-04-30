package com.algorithms.search;

public class LinearSearch {

	public static int search(int[] arr, int val) {
		int found = 0;
		for (int element : arr) {
			if (element == val) {
				found = element;
			}
		}
		return found;
	}

	/*
	 * Main method to test a sample integer array
	 */
	public static void main(String[] args) {
		int[] ar = { 31, 41, 59, 26, 41, 58, 45, 24, 67, 68, 68 };
		System.out.println("Value: " + search(ar, 52));
	}
}
