package com.senac.tela;

public class mostraTabuleiro {

	public static void telaTabuleiro(String[][] tabuleiro) {

		System.out.println("\tA \tB \tC \tD \tE \tF \tG \tH \tI \tJ");
		System.out.println();
		
		for (int linha = 0; linha < tabuleiro.length; linha++) {
			System.out.print((linha) + "");
			for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
				System.out.print("\t" + tabuleiro[linha][coluna]);
			}
			System.out.println();
		}		
		System.out.println("\n---------------------------------------------------------------------------------------------\n");
		
		System.out.println("\tA \tB \tC \tD \tE \tF \tG \tH \tI \tJ");
		System.out.println();

		for (int linha = 0; linha < tabuleiro.length; linha++) {
			System.out.print((linha) + "");
			for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
				if (tabuleiro[linha][coluna].equals("0")) {
					System.out.print("\t" + "0");
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