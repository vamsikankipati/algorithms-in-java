package com.algos.sort;

public class Insertion {

	/*
	 * Static method that returns sorted array using insertion sort method in
	 * increasing order
	 */
	public static int[] increasing(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while ((j >= 0) && (arr[j] > key)) {
				arr[j + 1] = arr[j];
				j = j - 1;
				arr[j + 1] = key;
			}
		}
		return arr;
	}

	/*
	 * Static method that returns sorted array using insertion sort method in
	 * decreasing order
	 */
	public static int[] decreasing(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while ((j >= 0) && (arr[j] < key)) {
				arr[j + 1] = arr[j];
				j = j - 1;
				arr[j + 1] = key;
			}
		}
		return arr;
	}

	/*
	 * Main method to test an example integer array
	 */
	public static void main(String[] args) {
		int[] ar = { 31, 41, 59, 26, 41, 58 };
		System.out.println("Increasing: ");
		increasing(ar);
		for (int a : ar) {
			System.out.print(a + " ");
		}
		System.out.println("\nDecreasing: ");
		decreasing(ar);
		for (int a : ar) {
			System.out.print(a + " ");
		}
	}
}
