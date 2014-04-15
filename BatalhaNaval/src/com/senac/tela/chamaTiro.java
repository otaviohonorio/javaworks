package com.senac.tela;

import java.util.Scanner;

public class chamaTiro {

	private static Scanner entrada;
	int[] tiro = new int[2];

	public int[] getTiro() {
		return tiro;
	}

	public static void darTiro(int[] tiro) {
		entrada = new Scanner(System.in);

		String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

		System.out.println();
		
		System.out.print("Linha: ");
		tiro[0] = entrada.nextInt();

		System.out.print("Coluna: ");
		String aux = entrada.next().toUpperCase();

		for (int i = 0; i <= alpha.length - 1; i++) {
			if (aux.equals(alpha[i])) {
				tiro[1] = i;
			}
		}
		
		System.out.println();
	}
}
