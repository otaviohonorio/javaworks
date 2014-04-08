package com.senac.estrutra.heap;

public class HeapSort {

	public static void main(String[] args) {

		int array[] = { 9, 5, 4, 6, 8, 7, 1, 3, 2, 0 };

		System.out.print("Antes da ordenacao: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		array = heapSort(array, array.length);

		System.out.print("Depois da ordenacao: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}

	public static int[] heapSort(int[] v, int n) {
		buildMaxHeap(v);

		for (int i = v.length - 1; i > 0; i--) {
			swap(v, i, 0);
			maxHeapify(v, 0, --n);
		}
		return v;
	}

	private static void buildMaxHeap(int[] v) {
		for (int i = v.length / 2 - 1; i >= 0; i--)
			maxHeapify(v, i, v.length);
	}

	private static void maxHeapify(int[] v, int pos, int n) {
		int maxi;
		int l = 2 * pos + 1;
		int right = 2 * pos + 2;
		if ((l < n) && (v[l] > v[pos])) {
			maxi = l;
		} else {
			maxi = pos;
		}
		if (right < n && v[right] > v[maxi]) {
			maxi = right;
		}
		if (maxi != pos) {
			swap(v, pos, maxi);
			maxHeapify(v, maxi, n);
		}
	}

	public static void swap(int[] v, int j, int aposJ) {
		int aux = v[j];
		v[j] = v[aposJ];
		v[aposJ] = aux;
	}

}
