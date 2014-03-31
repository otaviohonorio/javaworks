package com.senac.tabuleiro;

import java.util.Random;

public class montaEmbarcacoes {

	public static void iniciaSubmarino(String[][] tab) {

		int qtd = embarcacoes.submarino().getQuantidade();
		int tamanho = embarcacoes.submarino().getTamanho();
		String ident = embarcacoes.submarino().getIdent();

		for (int q = 0; q < qtd; q++) {
			int[] arr = verificaEspaco(tab, tamanho);

			for (int coluna = 0; coluna < tamanho; coluna++) {
				tab[arr[0]][arr[1]++] = ident;
			}
		}
	}

	public static void iniciaTorpedeiro(String[][] tab) {

		int qtd = embarcacoes.torpedeiro().getQuantidade();
		int tamanho = embarcacoes.torpedeiro().getTamanho();
		String ident = embarcacoes.torpedeiro().getIdent();

		for (int q = 0; q < qtd; q++) {
			int[] arr = verificaEspaco(tab, tamanho);

			for (int coluna = 0; coluna < tamanho; coluna++) {
				tab[arr[0]][arr[1]++] = ident;
			}
		}
	}

	public static void iniciaFragata(String[][] tab) {

		int qtd = embarcacoes.fragata().getQuantidade();
		int tamanho = embarcacoes.fragata().getTamanho();
		String ident = embarcacoes.fragata().getIdent();

		for (int q = 0; q < qtd; q++) {
			int[] arr = verificaEspaco(tab, tamanho);

			for (int coluna = 0; coluna < tamanho; coluna++) {
				tab[arr[0]][arr[1]++] = ident;
			}
		}
	}

	public static void iniciaDestroyer(String[][] tab) {

		int qtd = embarcacoes.destroyer().getQuantidade();
		int tamanho = embarcacoes.destroyer().getTamanho();
		String ident = embarcacoes.destroyer().getIdent();

		for (int q = 0; q < qtd; q++) {
			int[] arr = verificaEspaco(tab, tamanho);

			for (int coluna = 0; coluna < tamanho; coluna++) {
				tab[arr[0]][arr[1]++] = ident;
			}
		}
	}

	public static void iniciaPortaAviao(String[][] tab) {

		int qtd = embarcacoes.portaAviao().getQuantidade();
		int tamanho = embarcacoes.portaAviao().getTamanho();
		String ident = embarcacoes.portaAviao().getIdent();

		for (int q = 0; q < qtd; q++) {
			int[] arr = verificaEspaco(tab, tamanho);
			
			for (int coluna = 0; coluna < tamanho; coluna++) {
				tab[arr[0]][arr[1]++] = ident;
			}
		}
	}

	public static int[] verificaEspaco(String[][] tab, int tamanho) {

		int[] arr = { -1, -1 };
		boolean done = false;
		Random sorteio = new Random();
		
		if (tamanho == 1) {
			arr[0] = sorteio.nextInt(tab.length);
			arr[1] = sorteio.nextInt(tab.length);
			return arr;
		}
		
		while (done == false) {
			for (int linha = sorteio.nextInt(tab.length); linha < tab.length; linha++) {
				for (int coluna = sorteio.nextInt(tab.length); coluna < tab.length; coluna++) {
					if (tab[linha][coluna].equals(".")) {
					
						if (coluna == tamanho) {
							arr[0] = linha;
							arr[1] = coluna;
							done = true;
						}		
					}else{
						break;
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
