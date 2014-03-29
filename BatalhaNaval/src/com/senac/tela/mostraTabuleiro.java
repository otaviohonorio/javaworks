package com.senac.tela;

public class mostraTabuleiro {

	public static void telaTabuleiro(int[][] tabuleiro) {

		System.out.println("\tA \tB \tC \tD \tE \tF \tG \tH \tI \tJ");
		System.out.println();

		for (int linha = 0; linha < 10; linha++) {
			System.out.print((linha) + "");
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