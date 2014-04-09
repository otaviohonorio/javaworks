package com.senac.estrutra.heap;

public class HeapSort {
	
	public static int compara = 0;
	public static int troca = 0;

	public static void main(String[] args) {

		int array[] = { 9, 5, 4, 6, 8, 7, 1, 3, 2 };

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
		System.out.println("Comparacoes: "+compara+" Troca: "+troca);

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
		for (int i = v.length / 2; i >= 0; i--)
			maxHeapify(v, i, v.length);
	}

	private static void maxHeapify(int[] v, int pos, int n) {
		int max;
		
		int left = 2 * pos + 1;
		int right = 2 * pos + 2;
		
		compara++;
		if ((left < n) && (v[left] > v[pos])) {
			max = left;
			troca++;
		} else {
			troca++;
			max = pos;
		}
		
		compara++;
		if ((right < n) && (v[right] > v[max])) {
			max = right;
			troca++;
		}
		
		compara++;
		if (max != pos) {
			swap(v, pos, max);
			maxHeapify(v, max, n);
		}
	}

	public static void swap(int[] v, int j, int apos) {
		int aux = v[j];
		v[j] = v[apos];
		v[apos] = aux;
	}

}
