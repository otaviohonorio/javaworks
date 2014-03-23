package com.senac.estrutura.pessoa;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private String telefone;
	
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
	
	@Override
	public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());  
    }
}