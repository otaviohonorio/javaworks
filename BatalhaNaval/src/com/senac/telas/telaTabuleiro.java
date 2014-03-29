package com.senac.telas;

public class telaTabuleiro {

	public static void mostraTabuleiro(int[][] tabuleiro) {

		System.out.println("\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10");
		System.out.println();

		for (int linha = 0; linha < 10; linha++) {
			System.out.print((linha + 1) + "");
			for (int coluna = 0; coluna < 10; coluna++) {
				if (tabuleiro[linha][coluna] == -1) {
					System.out.print("\t" + ".");
				} else if (tabuleiro[linha][coluna] == 0) {
					System.out.print("\t" + "-");
				} else if (tabuleiro[linha][coluna] == 1) {
					System.out.print("\t" + "O");
				}

			}
			System.out.println();
		}
	}
}