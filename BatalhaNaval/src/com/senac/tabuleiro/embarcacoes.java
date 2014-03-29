package com.senac.tabuleiro;

import java.util.Random;

public class embarcacoes {
	
	int[][] navios = new int[3][2];
	
	public int[][] getNavios() {
		return navios;
	}

	public void setNavios(int[][] navios) {
		this.navios = navios;
	}

	public static void iniciaNavios(int[][] navios) {
		Random sorteio = new Random();

		for (int navio = 0; navio < 3; navio++) {
			navios[navio][0] = sorteio.nextInt(10);
			navios[navio][1] = sorteio.nextInt(10);

			for (int anterior = 0; anterior < navio; anterior++) {
				if ((navios[navio][0] == navios[anterior][0])
						&& (navios[navio][1] == navios[anterior][1]))
					do {
						navios[navio][0] = sorteio.nextInt(10);
						navios[navio][1] = sorteio.nextInt(10);
					} while ((navios[navio][0] == navios[anterior][0])
							&& (navios[navio][1] == navios[anterior][1]));
			}
		}
	}

}
