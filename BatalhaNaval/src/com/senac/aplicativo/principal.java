package com.senac.aplicativo;

import com.senac.regra.controle;
import com.senac.tabuleiro.*;
import com.senac.tela.*;

public class principal {

	public static void main(String[] args) {

		controle j = new controle();
		int tentativas = j.getTentativas();
		int pontos = j.getPontos();
		int acertos = j.getAcertos();

		montaTabuleiro t = new montaTabuleiro();
		String[][] tab = t.getTabuleiro();

		chamaTiro i = new chamaTiro();
		int[] tir = i.getTiro();

		montaTabuleiro.inicializaTabuleiro(tab);
		montaEmbarcacoes.iniciaEmbarcacoes(tab);

		System.out.println();

		boolean done = false;
		
		while (done != true) {

			mostraTabuleiro.telaTabuleiro(tab);

			chamaTiro.darTiro(tir);

			tentativas++;

			if (mostraAcerto.acertou(tir, tab) == true) {
				
				acertos++;
				pontos = mostraPontos.pontos(tir, tab, pontos);
								
			} else {
				pontos--;
			}

			montaTabuleiro.alteraTabuleiro(tir, tab);
			
			if ((pontos == 0) || (acertos == 28)) {
				done = true;
			} else {
				System.out.println("\n\n Jogo em andamento. Acertos: " + acertos
						+ " / Pontos: " + pontos + " / Tentativas: " + tentativas);
			}

		}

		System.out.println("\n\n Jogo terminado. Acertos: " + acertos
				+ " / Pontos: " + pontos + " / Tentativas: " + tentativas);
		mostraTabuleiro.telaTabuleiro(tab);

	}
}
