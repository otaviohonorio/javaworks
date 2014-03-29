package com.senac.aplicativo;

import com.senac.tabuleiro.*;
import com.senac.tela.*;

public class principal {

	    public static void main(String[] args) {
	    		        
	        int tentativas=0, acertos=0;
	        
	        montaTabuleiro t = new montaTabuleiro();
	        int[][] tab = t.getTabuleiro();

	        montaEmbarcacoes n = new montaEmbarcacoes();
	        int[][] nav = n.getNavios();
	        
	        chamaTiro i = new chamaTiro();
	        int[] tir = i.getTiro();
	        
	        montaTabuleiro.inicializaTabuleiro(tab);
	        montaEmbarcacoes.iniciaNavios(nav);
	        	        
	        System.out.println();
	        
	        do{
	            mostraTabuleiro.telaTabuleiro(tab);
	            chamaTiro.darTiro(tir);
	            tentativas++;
	            
	            if(mostraAcerto.acertou(tir,nav)){
	                acertos++;
	            }                
	            
	            montaTabuleiro.alteraTabuleiro(tir,nav,tab);
	            

	        }while(acertos!=10 || tentativas==15);
	        
	        System.out.println("\n");
	        System.out.println("Jogo terminado. Acertos: "+acertos+" / Tentativas: "+tentativas);
	        mostraTabuleiro.telaTabuleiro(tab);
	    }
}
