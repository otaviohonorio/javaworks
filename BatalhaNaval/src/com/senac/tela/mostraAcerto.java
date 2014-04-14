package com.senac.tela;

public class mostraAcerto {

	public static boolean acertou(int[] tiro, String[][] tabuleiro) {

		if (tabuleiro[tiro[0]][tiro[1]].equals(".")) {
			return false;
		}else if (tabuleiro[tiro[0]][tiro[1]].equals("-")) {
			System.out.println("Favor escolher novas posicoes!");
			return false;
		}else if (Integer.valueOf(tabuleiro[tiro[0]][tiro[1]]) > 0) {
			return true;
		} else {
			return false;
		}
		
	}

}
