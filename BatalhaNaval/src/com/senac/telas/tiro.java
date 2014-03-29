package com.senac.telas;

import java.util.Scanner;

public class tiro {
	
    private static Scanner entrada;
    int[] tiro = new int[2];

	public int[] getTiro() {
		return tiro;
	}

	public void setTiro(int[] tiro) {
		this.tiro = tiro;
	}

	public static void darTiro(int[] tiro){
        entrada = new Scanner(System.in);
        
        System.out.print("Linha: ");
        tiro[0] = entrada.nextInt();
        tiro[0]--;
        
        System.out.print("Coluna: ");
        tiro[1] = entrada.nextInt();
        tiro[1]--;   
    }
}
