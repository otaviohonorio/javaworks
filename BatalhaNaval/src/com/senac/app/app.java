package com.senac.app;

import com.senac.tabuleiro.*;
import com.senac.telas.*;

public class app {

	    public static void main(String[] args) {
	    		        
	        int tentativas=0, acertos=0;
	        
	        tabuleiro t = new tabuleiro();
	        int[][] tab = t.getTabuleiro();

	        embarcacoes n = new embarcacoes();
	        int[][] nav = n.getNavios();
	        
	        tiro i = new tiro();
	        int[] tir = i.getTiro();
	        
	        tabuleiro.inicializaTabuleiro(tab);
	        embarcacoes.iniciaNavios(nav);
	        
	        System.out.println();
	        
	        do{
	            telaTabuleiro.mostraTabuleiro(tab);
	            tiro.darTiro(tir);
	            tentativas++;
	            
	            if(acerto.acertou(tir,nav)){
	                dica.dicas(tir,nav,tentativas);
	                acertos++;
	            }                
	            else
	                dica.dicas(tir,nav,tentativas);
	            
	            tabuleiro.alteraTabuleiro(tir,nav,tab);
	            

	        }while(acertos!=3);
	        
	        System.out.println("\n\n\nJogo terminado. Você acertou os 3 navios em "+tentativas+" tentativas");
	        telaTabuleiro.mostraTabuleiro(tab);
	    }
}
