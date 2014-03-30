package com.senac.tabuleiro;

import java.util.Random;

public class montaEmbarcacoes {

	static Random sorteio = new Random();

	public static void iniciaSubmarino(String[][] tab) {

		int qtd = embarcacoes.submarino().getQuantidade();
		int tamanho = embarcacoes.submarino().getTamanho();
		int delta = (tab.length - tamanho);
		String ident = embarcacoes.submarino().getIdent();

		for (int q = 0; q < qtd; q++) {

			int linha = sorteio.nextInt(tab.length);
			int coluna = sorteio.nextInt(delta);

			if (tab[linha][coluna].equals(".")) {
				for (int t = 0; t < tamanho; t++) {
					if (tab[linha][coluna].equals(".")) {
						tab[linha][coluna] = ident;
					}else{
						if (linha > delta) {
							linha--;
						}else{
							linha++;
						}
					}
					coluna++;
				}
			}
		}
	}

	public static void iniciaTorpedeiro(String[][] tab) {

		int qtd = embarcacoes.torpedeiro().getQuantidade();
		int tamanho = embarcacoes.torpedeiro().getTamanho();
		int delta = (tab.length - tamanho);
		String ident = embarcacoes.torpedeiro().getIdent();

		for (int q = 0; q < qtd; q++) {

			int linha = sorteio.nextInt(tab.length);
			int coluna = sorteio.nextInt(delta);

			if (tab[linha][coluna].equals(".")) {
				for (int t = 0; t < tamanho; t++) {
					if (tab[linha][coluna].equals(".")) {
						tab[linha][coluna] = ident;
					}else{
						if (linha > delta) {
							linha--;
						}else{
							linha++;
						}
					}
					coluna++;
				}
			}
		}
	}

	public static void iniciaFragata(String[][] tab) {

		int qtd = embarcacoes.fragata().getQuantidade();
		int tamanho = embarcacoes.fragata().getTamanho();
		int delta = (tab.length - tamanho);
		String ident = embarcacoes.fragata().getIdent();

		for (int q = 0; q < qtd; q++) {

			int linha = sorteio.nextInt(tab.length);
			int coluna = sorteio.nextInt(delta);

			if (tab[linha][coluna].equals(".")) {
				for (int t = 0; t < tamanho; t++) {
					if (tab[linha][coluna].equals(".")) {
						tab[linha][coluna] = ident;
					}else{
						if (linha > delta) {
							linha--;
						}else{
							linha++;
						}
					}
					coluna++;
				}
			}
		}
	}

	public static void iniciaDestroyer(String[][] tab) {

		int qtd = embarcacoes.destroyer().getQuantidade();
		int tamanho = embarcacoes.destroyer().getTamanho();
		int delta = (tab.length - tamanho);
		String ident = embarcacoes.destroyer().getIdent();

		for (int q = 0; q < qtd; q++) {

			int linha = sorteio.nextInt(tab.length);
			int coluna = sorteio.nextInt(delta);

			if (tab[linha][coluna].equals(".")) {
				for (int t = 0; t < tamanho; t++) {
					if (tab[linha][coluna].equals(".")) {
						tab[linha][coluna] = ident;
					}else{
						if (linha > delta) {
							linha--;
						}else{
							linha++;
						}
					}
					coluna++;
				}
			}
		}
	}

	public static void iniciaPortaAviao(String[][] tab) {

		int qtd = embarcacoes.portaAviao().getQuantidade();
		int tamanho = embarcacoes.portaAviao().getTamanho();
		int delta = (tab.length - tamanho);
		String ident = embarcacoes.portaAviao().getIdent();

		for (int q = 0; q < qtd; q++) {

			int linha = sorteio.nextInt(tab.length);
			int coluna = sorteio.nextInt(delta);

			if (tab[linha][coluna].equals(".")) {
				for (int t = 0; t < tamanho; t++) {
					if (tab[linha][coluna].equals(".")) {
						tab[linha][coluna] = ident;
					}else{
						if (linha > delta) {
							linha--;
						}else{
							linha++;
						}
					}
					coluna++;
				}
			}
		}
	}

	public static void iniciaEmbarcacoes(String[][] tabuleiro) {

		iniciaSubmarino(tabuleiro);
		iniciaTorpedeiro(tabuleiro);
		iniciaFragata(tabuleiro);
		iniciaDestroyer(tabuleiro);
		iniciaPortaAviao(tabuleiro);
		
	}
}
