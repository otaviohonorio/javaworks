package com.senac.tabuleiro;

import com.senac.tela.mostraAcerto;

public class montaTabuleiro {

	int[][] tabuleiro = new int[10][10];

	public int[][] getTabuleiro() {
		return tabuleiro;
	}

	public static void inicializaTabuleiro(int[][] tabuleiro) {
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				tabuleiro[linha][coluna] = -1;
			}
		}
	}

	public static void alteraTabuleiro(int[] tiro, int[][] navios,
			int[][] tabuleiro) {

		if (mostraAcerto.acertou(tiro, navios))
			tabuleiro[tiro[0]][tiro[1]] = 1;
		else
			tabuleiro[tiro[0]][tiro[1]] = 0;
	}

}
