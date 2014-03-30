package com.senac.tela;

public class mostraAcerto {

	public static boolean acertou(int[] tiro, String[][] tabuleiro) {

		if (tabuleiro[tiro[0]][tiro[1]].equals("5")) {
			tabuleiro[tiro[0]][tiro[1]] = "O";
			System.out.println("Acertou um Submarino");	
			return true;
		}
		
		if (tabuleiro[tiro[0]][tiro[1]].equals("4")) {
			tabuleiro[tiro[0]][tiro[1]] = "O";
			System.out.println("Acertou um Torpedeiro de 2 unidades");	
			return true;
		}
		
		if (tabuleiro[tiro[0]][tiro[1]].equals("3")) {
			tabuleiro[tiro[0]][tiro[1]] = "O";
			System.out.println("Acertou uma Fragata de 3 unidades");	
			return true;
		}
		
		if (tabuleiro[tiro[0]][tiro[1]].equals("2")) {
			tabuleiro[tiro[0]][tiro[1]] = "O";
			System.out.println("Acertou um Destroyer de 4 unidades");	
			return true;
		}
		
		if (tabuleiro[tiro[0]][tiro[1]].equals("1")) {
			tabuleiro[tiro[0]][tiro[1]] = "O";
			System.out.println("Acertou um Porta-Aviao de 5 unidades");	
			return true;
		}
		
		return false;
	}

}
