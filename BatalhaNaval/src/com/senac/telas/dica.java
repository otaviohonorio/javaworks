package com.senac.telas;

public class dica {

    public static void dicas(int[] tiro, int[][] navios, int tentativa){
        int linha=0,
            coluna=0;
        
        for(int fila=0 ; fila < navios.length ; fila++){
            if(navios[fila][0]==tiro[0])
                linha++;
            if(navios[fila][1]==tiro[1])
                coluna++;
        }
        
        System.out.printf("\nDica %d: \nlinha %d -> %d navios\n" +
                                 "coluna %d -> %d navios\n",tentativa,tiro[0]+1,linha,tiro[1]+1,coluna);
    }
	
}
