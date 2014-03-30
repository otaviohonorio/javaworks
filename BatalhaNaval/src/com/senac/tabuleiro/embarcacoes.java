package com.senac.tabuleiro;

public class embarcacoes {

	public int tamanho;
	public int quantidade;
	public String ident;

	public String getIdent() {
		return ident;
	}

	public void setIdent(String ident) {
		this.ident = ident;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static embarcacoes submarino() {
		embarcacoes submarino = new embarcacoes();
		submarino.setTamanho(1);
		submarino.setQuantidade(5);
		submarino.setIdent("5");
		
		return submarino;
	}

	public static embarcacoes torpedeiro() {
		embarcacoes torpedeiro = new embarcacoes();
		torpedeiro.setTamanho(2);
		torpedeiro.setQuantidade(3);
		torpedeiro.setIdent("4");
		
		return torpedeiro;
	}
	
	public static embarcacoes fragata() {
		embarcacoes fragata = new embarcacoes();
		fragata.setTamanho(3);
		fragata.setQuantidade(2);
		fragata.setIdent("3");
		
		return fragata;
	}
	
	public static embarcacoes destroyer() {
		embarcacoes destroyer = new embarcacoes();
		destroyer.setTamanho(4);
		destroyer.setQuantidade(2);
		destroyer.setIdent("2");
		
		return destroyer;
	}
	
	public static embarcacoes portaAviao() {
		embarcacoes portaAviao = new embarcacoes();
		portaAviao.setTamanho(5);
		portaAviao.setQuantidade(1);
		portaAviao.setIdent("1");
		
		return portaAviao;
	}
	
}
