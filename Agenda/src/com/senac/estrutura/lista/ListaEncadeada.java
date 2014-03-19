package com.senac.estrutura.lista;

import static java.lang.System.out;
import com.senac.model.Nodo;

public class ListaEncadeada<String> {

	protected Nodo<String> head;
	protected Nodo<String> tail;

	public void insert(Nodo<String> novo) {
		novo.setNext(head);
		head = novo;
		if (tail == null)
			tail = novo;
	}

	public void insert(Nodo<String> novo, Nodo<String> anterior) {
		novo.setNext(anterior.getNext());
		anterior.setNext(novo);
		if (anterior == tail)
			tail = novo;
	}

	public void append(Nodo<String> novo) {
		if (tail != null)
			tail.setNext(novo);
		else
			head = novo;
		tail = novo;
	}

	public void print() {
		Nodo<String> elem = head;
		do {
			out.println("Nome: "+elem.getData()+" Fone: "+elem.getFone());
			elem = elem.getNext();
		} while (elem != null);
	}
}
