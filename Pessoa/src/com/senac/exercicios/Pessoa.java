package com.senac.exercicios;

import static java.lang.System.out;

public class Pessoa {

	private String nome;
	private String dataNascimento;
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public Pessoa(String nome, String nasc) {  
	    this.nome = nome;  
	    this.dataNascimento = nasc;
	}
	
	public static void main(String[] args) {
		Pessoa oRocket = new Pessoa("Otto Rocket","13/08/1987");
	    oRocket.setNome("Otto Rocket Power");
		
	    out.println(oRocket.nome);
	    out.println(oRocket.dataNascimento);
	}
	
}
