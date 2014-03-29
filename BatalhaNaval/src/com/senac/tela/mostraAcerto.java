package com.senac.tela;

public class mostraAcerto {

	public static boolean acertou(int[] tiro, int[][] navios){
        
        for(int navio=0 ; navio<navios.length ; navio++){
            if( tiro[0]==navios[navio][0] && tiro[1]==navios[navio][1]){
                System.out.printf("Você acertou o tiro (%d,%d)\n",tiro[0]+1,tiro[1]+1);
                return true;
            }
        }
        return false;
    }
	
}
