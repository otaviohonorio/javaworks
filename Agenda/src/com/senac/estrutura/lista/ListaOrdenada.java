package com.senac.estrutura.lista;

public class ListaOrdenada<T extends Comparable<T>> extends ListaEncadeada<T> {

	private Nodo<T> procuraNodo(T data) {
		Nodo<T> nodo = head;
		Nodo<T> anterior = null;

		while (nodo != null) {
			int cmp = nodo.getData().compareTo(data);

			if (cmp == 0)
				return nodo;

			if (cmp > 0) {
				return anterior;
			}
			anterior = nodo;
			nodo = nodo.getNext();
		}

		return nodo;
	}

	@Override
	public void insert(Nodo<T> novo) {
		Nodo<T> anterior = procuraNodo(novo.getData());

		if (anterior != null) {
			novo.setNext(anterior.getNext());
			anterior.setNext(novo);

			if (anterior == tail)
				tail = novo;

		} else {
			if (tail != null) {

				int test = novo.getData().compareTo(head.getData());
				if (test < 0) {
					novo.setNext(head);
					head = novo;
				} else {
					tail.setNext(novo);
				}

			} else {
				head = novo;
				tail = novo;
			}

		}
	}

	@Override
	public void insert(Nodo<T> novo, Nodo<T> anterior) {
		insert(novo);
	}

	@Override
	public void append(Nodo<T> novo) {
		insert(novo);
	}

	// Remove n
	public void remove(Nodo<T> nodo) {
		Nodo<T> inicio = this.getHead();
		Nodo<T> anterior = null;

		while (inicio != this.getTail()) {
			if (nodo == inicio) {
				if (anterior != null) {
					anterior.setNext(inicio.getNext());
				} else {
					inicio.getNext();
				}
			}

			anterior = inicio;

			inicio = inicio.getNext();

		}

	}

}
