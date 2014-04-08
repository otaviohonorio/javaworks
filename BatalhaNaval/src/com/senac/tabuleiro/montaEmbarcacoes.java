package com.senac.tabuleiro;

import java.util.Random;

public class montaEmbarcacoes {

	public static void iniciaSubmarino(String[][] tab) {

		int qtd = embarcacoes.submarino().getQuantidade();
		int tamanho = embarcacoes.submarino().getTamanho();
		String ident = embarcacoes.submarino().getIdent();

		for (int q = 0; q < qtd; q++) {
			int[] arr = verificaEspaco(tab, tamanho);

			if (arr[2] == 11) {
				for (int coluna = 0; coluna < tamanho; coluna++) {
					tab[arr[0]][arr[1]++] = ident;
				}
			} else {
				for (int linha = 0; linha < tamanho; linha++) {
					tab[arr[0]++][arr[1]] = ident;
				}
			}
		}
	}

	public static void iniciaTorpedeiro(String[][] tab) {

		int qtd = embarcacoes.torpedeiro().getQuantidade();
		int tamanho = embarcacoes.torpedeiro().getTamanho();
		String ident = embarcacoes.torpedeiro().getIdent();

		for (int q = 0; q < qtd; q++) {
			int[] arr = verificaEspaco(tab, tamanho);

			if (arr[2] == 11) {
				for (int coluna = 0; coluna < tamanho; coluna++) {
					tab[arr[0]][arr[1]++] = ident;
				}
			} else {
				for (int linha = 0; linha < tamanho; linha++) {
					tab[arr[0]++][arr[1]] = ident;
				}
			}
		}
	}

	public static void iniciaFragata(String[][] tab) {

		int qtd = embarcacoes.fragata().getQuantidade();
		int tamanho = embarcacoes.fragata().getTamanho();
		String ident = embarcacoes.fragata().getIdent();

		for (int q = 0; q < qtd; q++) {
			int[] arr = verificaEspaco(tab, tamanho);

			if (arr[2] == 11) {
				for (int coluna = 0; coluna < tamanho; coluna++) {
					tab[arr[0]][arr[1]++] = ident;
				}
			} else {
				for (int linha = 0; linha < tamanho; linha++) {
					tab[arr[0]++][arr[1]] = ident;
				}
			}
		}
	}

	public static void iniciaDestroyer(String[][] tab) {

		int qtd = embarcacoes.destroyer().getQuantidade();
		int tamanho = embarcacoes.destroyer().getTamanho();
		String ident = embarcacoes.destroyer().getIdent();

		for (int q = 0; q < qtd; q++) {
			int[] arr = verificaEspaco(tab, tamanho);

			if (arr[2] == 11) {
				for (int coluna = 0; coluna < tamanho; coluna++) {
					tab[arr[0]][arr[1]++] = ident;
				}
			} else {
				for (int linha = 0; linha < tamanho; linha++) {
					tab[arr[0]++][arr[1]] = ident;
				}
			}
		}
	}

	public static void iniciaPortaAviao(String[][] tab) {

		int qtd = embarcacoes.portaAviao().getQuantidade();
		int tamanho = embarcacoes.portaAviao().getTamanho();
		String ident = embarcacoes.portaAviao().getIdent();

		for (int q = 0; q < qtd; q++) {
			int[] arr = verificaEspaco(tab, tamanho);

			if (arr[2] == 11) {
				for (int coluna = 0; coluna < tamanho; coluna++) {
					tab[arr[0]][arr[1]++] = ident;
				}
			} else {
				for (int linha = 0; linha < tamanho; linha++) {
					tab[arr[0]++][arr[1]] = ident;
				}
			}
		}
	}

	public static int[] verificaEspaco(String[][] tab, int tamanho) {

		int[] arr = { -1, -1, -1 };
		Random sorteio = new Random();
		
		while (arr[0] == -1 && arr[1] == -1) {
			for (int linha = sorteio.nextInt(tab.length - tamanho); linha < tab.length; linha++) {
				for (int coluna = sorteio.nextInt(tab.length - tamanho); coluna < tab.length; coluna++) {
					if (tab[linha][coluna].equals(".")) {
						int l = linha;
						int c = coluna;
						if (coluna == tamanho) {
							arr[0] = l;
							arr[1] = c;
							arr[2] = 11;
							return arr;
						}
					}
				}
			}
			
			for (int coluna = sorteio.nextInt(tab.length - tamanho); coluna < tab.length; coluna++) {
				for (int linha = sorteio.nextInt(tab.length - tamanho); linha < tab.length; linha++) {
					if (tab[coluna][linha].equals(".")) {
						int l = linha;
						int c = coluna;
						if (linha == tamanho) {
							arr[0] = l;
							arr[1] = c;
							arr[2] = 12;
							return arr;
						}
					}
				}
			}
		}

		return arr;

	}

	public static void iniciaEmbarcacoes(String[][] tabuleiro) {

		iniciaSubmarino(tabuleiro);
		iniciaTorpedeiro(tabuleiro);
		iniciaFragata(tabuleiro);
		iniciaDestroyer(tabuleiro);
		iniciaPortaAviao(tabuleiro);

	}
}
