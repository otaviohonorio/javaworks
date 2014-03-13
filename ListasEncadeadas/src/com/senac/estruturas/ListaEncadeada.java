package com.senac.estruturas;

import static java.lang.System.out;

public class ListaEncadeada<T> {

	private T head;
	private T tail;
	
	public T getHead() {
		return head;
	}

	public void setHead(T head) {
		this.head = head;
	}

	public void insert(Nodo<T> novo) {
		novo.setNext(head);
		head = novo;
		if (tail == null)
			tail = novo;
	}
	
	public void insert(Nodo<T> novo, Nodo<T> anterior) {
		novo.setNext(anterior.getNext());
		anterior.setNext(novo);
		if (anterior == tail)
			tail = novo;
	}
	
	public void append(Nodo<T> novo) {
		if (tail != null)
			tail.setNext(novo);
		else
			head = novo;
		tail = novo;
	}
	
	public static void print(Nodo<Integer> head)
	{
		Nodo<Integer> elem = head;
		do {
			out.println(elem.getData());
			elem = elem.getNext();
		} while (elem != null);
	}
	
	public static void main(String[] args) {
		// criar lista
		
		ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
		
		Nodo<Integer> novo = new Nodo<Integer>(1);
		lista.insert(novo);
		
		lista.insert(new Nodo<Integer>(2), novo);
		
		lista.append(new Nodo<Integer>(3));
		
		lista.insert(new Nodo<Integer>(4), novo);
		
		lista.print();
	}

}
