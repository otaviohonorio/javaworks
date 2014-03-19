package com.senac.exec;

import static java.lang.System.out;

import java.util.Scanner;

import com.senac.estrutura.lista.ListaOrdenada;
import com.senac.model.Nodo;
import com.senac.model.Pessoa;

public class exec {

	public static Pessoa contato;
	private static Scanner ler;

	private static Nodo<String> incluir(ListaOrdenada<String> lista,
			Nodo<String> novo) {
		ler = new Scanner(System.in);
		String nome, fone;

		out.println("Nome:");
		nome = ler.nextLine();
		out.println("Fone:");
		fone = ler.nextLine();

		if (novo == null) {
			novo = new Nodo<String>(nome, fone);
			lista.insert(novo);
		} else {
			lista.append(new Nodo<String>(nome, fone));
		}
		return novo;
	}

	private static void listar(ListaOrdenada<String> lista) {
		lista.print();
	}
	
	public static void main(String[] args) {

		ListaOrdenada<String> lista = new ListaOrdenada<String>();
		Nodo<String> novo = null;

		ler = new Scanner(System.in);
		int opcao;

		do {
			out.println("AGENDA");
			out.println("[1] Incluir");
			out.println("[2] Excluir");
			out.println("[3] Listar");
			out.println("[4] Pesquisar");
			out.println("[0] Encerrar");
			out.println("Opção Desejada: ");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				novo = incluir(lista, novo);
				break;
			// case 2: excluir(); break;
			case 3:
				listar(lista);
				break;
			//case 4: pesquisar(lista);
			}
			System.out.println();
		} while (opcao != 0);

		// lista.append(new Nodo<String>("c", "2"));
		// lista.insert(new Nodo<String>("d", "1"), novo);

	}

}
