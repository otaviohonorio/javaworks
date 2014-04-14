package com.senac.aplicativo;

import com.senac.regra.jogador;
import com.senac.tabuleiro.*;
import com.senac.tela.*;

public class principal {

	    public static void main(String[] args) {
	        
	        jogador j = new jogador();
	        int tentativas = j.getTentativas();
	        int acertos = j.getAcertos();
	        int pontos = j.getPontos();
	        
	        montaTabuleiro t = new montaTabuleiro();
	        String[][] tab = t.getTabuleiro();
	        
	        chamaTiro i = new chamaTiro();
	        int[] tir = i.getTiro();
	        
	        montaTabuleiro.inicializaTabuleiro(tab);
	        montaEmbarcacoes.iniciaEmbarcacoes(tab);
	        	        
	        System.out.println();
	        
	        do {
	            mostraTabuleiro.telaTabuleiro(tab);
	            chamaTiro.darTiro(tir);
	            tentativas++;
	            
	            if(mostraAcerto.acertou(tir,tab)){
	                acertos++;
	            }                
	            
	            montaTabuleiro.alteraTabuleiro(tir,tab);

	        } while(acertos!=15 || tentativas==15);
	        
	        System.out.println("\n\n Jogo terminado. Acertos: "+acertos+" / Tentativas: "+tentativas);
	        mostraTabuleiro.telaTabuleiro(tab);
	        
	    }
}
