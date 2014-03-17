package com.senac.model;

public class Pessoa {
	
	private String nome;
	private String telefone;
	public Pessoa contato;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void criarContato(String nome, String number) {
		contato = new Pessoa();
		contato.setNome(nome);
		contato.setTelefone(number);
	}
	
	public void exibirContato() {
		System.out.println("Nome: " + contato.getNome() + " Number: " + contato.getTelefone());
	}
	
}
