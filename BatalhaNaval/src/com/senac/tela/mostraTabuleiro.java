package com.senac.tela;

public class mostraTabuleiro {

	public static void telaTabuleiro(String[][] tabuleiro) {

		/*
		for (int linha = 0; linha < tabuleiro.length; linha++) {
			System.out.print((linha) + "");
			for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
				System.out.print("\t" + tabuleiro[linha][coluna]);
			}
			System.out.println();
		}		
		System.out.println("\n---------------------------------------------------------------------------------------------\n");
		*/
		
		System.out.println("\tA \tB \tC \tD \tE \tF \tG \tH \tI \tJ");
		System.out.println();

		for (int linha = 0; linha < 10; linha++) {
			System.out.print((linha) + "");
			for (int coluna = 0; coluna < 10; coluna++) {
				if (tabuleiro[linha][coluna].equals("O")) {
					System.out.print("\t" + "O");
				} else if (tabuleiro[linha][coluna].equals("-")) {
						System.out.print("\t" + "-");
				} else if (tabuleiro[linha][coluna] != ".") {
					System.out.print("\t" + ".");
				} else {
					System.out.print("\t" + ".");
				}
			}
			System.out.println();
		}
	}
}