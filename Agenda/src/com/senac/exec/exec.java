package com.senac.exec;

import com.senac.estruturas.ListaOrdenada;
import com.senac.estruturas.Nodo;

public class exec {

	public static void main(String[] args) {
		
		// criar lista
		ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();

		Nodo<Integer> novo = new Nodo<Integer>(1);
		lista.insert(novo);

		lista.insert(new Nodo<Integer>(2), novo);

		lista.append(new Nodo<Integer>(3));

		lista.insert(new Nodo<Integer>(4), novo);

		lista.print();
	}

}
