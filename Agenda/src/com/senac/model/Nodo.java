package com.senac.model;

public class Nodo<String> {

	private String dado;
	private String fone;
	private Nodo<String> next;

	public Nodo(String contato, String f) {
		dado = contato;
		fone = f;
		next = null;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String f) {
		fone = f;
		next = null;
	}

	public void setData(String i) {
		dado = i;
		next = null;
	}

	public String getData() {
		return dado;
	}

	public void setNext(Nodo<String> next) {
		this.next = next;
	}

	public Nodo<String> getNext() {
		return next;
	}
}
