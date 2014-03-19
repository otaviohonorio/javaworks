package com.senac.estrutura.lista;

import com.senac.model.Nodo;

public class ListaOrdenada<String extends Comparable<String>> extends ListaEncadeada<String> {

	private Nodo<String> procuraNodo(String data) {
		Nodo<String> nodo = head;
		Nodo<String> anterior = null;

		while (nodo != null) {
			int cmp = nodo.getData().compareTo(data);
			if (cmp == 0)
				return nodo;
			if (cmp > 0)
				return anterior;
			anterior = nodo;
			nodo = nodo.getNext();
		}

		return nodo;
	}

	@Override
	public void insert(Nodo<String> novo) {
		Nodo<String> anterior = procuraNodo(novo.getData());

		if (anterior != null) {
			novo.setNext(anterior.getNext());
			anterior.setNext(novo);
			if (anterior == tail)
				tail = novo;
		} else {
			if (tail != null) {
				tail.setNext(novo);
			} else {
				head = novo;
			}
			tail = novo;
		}
	}

	@Override
	public void insert(Nodo<String> novo, Nodo<String> anterior) {
		insert(novo);
	}

	@Override
	public void append(Nodo<String> novo) {
		insert(novo);
	}

}
