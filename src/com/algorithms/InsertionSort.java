package com.algorithms;

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
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

	public static void main(String[] args) {
		int[] ar = { 5, 2, 6, 4, 7, 3, 8 };
		insertionSort(ar);
		for (int a : ar) {
			System.out.print(a + " ");
		}
	}
}
