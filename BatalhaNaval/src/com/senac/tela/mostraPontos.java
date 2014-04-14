package com.senac.tela;

public class mostraPontos {

	static int qtd_tor = 0;

	public static int pontos(int[] tiro, String[][] tabuleiro, int pontos) {

		if (tabuleiro[tiro[0]][tiro[1]].equals("1")) {
			System.out.println("Acertou um Submarino");
			pontos = pontos + 5;
		}

		if (tabuleiro[tiro[0]][tiro[1]].equals("2")) {
			System.out.println("Acertou um Torpedeiro de 2 unidades");
			qtd_tor++;
			if (qtd_tor == 2) {
				pontos = pontos + 5;
			} else {
				pontos = pontos + 3;
			}
		}

		if (tabuleiro[tiro[0]][tiro[1]].equals("3")) {
			System.out.println("Acertou uma Fragata de 3 unidades");
			qtd_tor++;
			if (qtd_tor == 3) {
				pontos = pontos + 5;
			} else {
				pontos = pontos + 3;
			}
		}

		if (tabuleiro[tiro[0]][tiro[1]].equals("4")) {
			System.out.println("Acertou um Destroyer de 4 unidades");
			qtd_tor++;
			if (qtd_tor == 4) {
				pontos = pontos + 5;
			} else {
				pontos = pontos + 3;
			}
		}

		if (tabuleiro[tiro[0]][tiro[1]].equals("5")) {
			System.out.println("Acertou um Porta-Aviao de 5 unidades");
			qtd_tor++;
			if (qtd_tor == 5) {
				pontos = pontos + 5;
			} else {
				pontos = pontos + 3;
			}
		}

		return pontos;
	}

}
