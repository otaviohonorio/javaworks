package com.senac.estruturas;

public class Nodo<T> {
	
	private T  dado;
	private T next;
	
	public Nodo(T i) {
		dado = i;
		next = null;
	}
	
	public void setData(T i) {
		dado = i;
		next = null;
	}
	
	public T getData() {
		return dado;
	}

	public void setNext(T next) {
		this.next = next;
	}
	
	public T getNext() {
		return next;
	}
	
}
