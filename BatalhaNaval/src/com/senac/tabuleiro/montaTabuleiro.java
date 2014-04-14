package com.senac.tabuleiro;

import com.senac.tela.mostraAcerto;

public class montaTabuleiro {

	String[][] tabuleiro = new String[10][10];

	public String[][] getTabuleiro() {
		return tabuleiro;
	}

	public static void inicializaTabuleiro(String[][] tab) {
		for (int linha = 0; linha < tab.length; linha++) {
			for (int coluna = 0; coluna < tab.length; coluna++) {
				tab[linha][coluna] = ".";
			}
		}
	}

	public static void alteraTabuleiro(int[] tiro, String[][] tabuleiro) {

		if (mostraAcerto.acertou(tiro,tabuleiro) == true) {
			tabuleiro[tiro[0]][tiro[1]] = "0";
		}else{
			tabuleiro[tiro[0]][tiro[1]] = "-";
		}
	}
	
}
