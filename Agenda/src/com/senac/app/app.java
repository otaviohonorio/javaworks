package com.senac.app;

import static java.lang.System.out;

import java.util.Scanner;

import com.senac.estrutura.file.FileManager;
import com.senac.estrutura.lista.ListaOrdenada;
import com.senac.estrutura.lista.Nodo;
import com.senac.estrutura.pessoa.Pessoa;

public class app {

	private static Scanner ler;

	private static Nodo<Pessoa> incluir(ListaOrdenada<Pessoa> lista,
			Nodo<Pessoa> novo) {

		ler = new Scanner(System.in);
		String nome, fone;

		out.println("Nome:");
		nome = ler.nextLine();
		out.println("Fone:");
		fone = ler.nextLine();

		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setTelefone(nome);

		if (novo == null) {
			novo = new Nodo<Pessoa>(p);
			lista.insert(novo);
		} else {
			lista.append(new Nodo<Pessoa>(p));
		}

		FileManager f = new FileManager();
		f.Write(nome, fone);

		return novo;
	}

	public static void listar(ListaOrdenada<Pessoa> lista) {

		Nodo<Pessoa> elem = lista.getHead();
		do {
			out.println("Nome: " + ((Pessoa) elem.getData()).getNome()
					+ " Fone: " + ((Pessoa) elem.getData()).getTelefone());
			elem = elem.getNext();
		} while (elem != null);

	}

	public static void excluir(ListaOrdenada<Pessoa> lista) {

		ler = new Scanner(System.in);
		String nome;

		out.println("Nome:");
		nome = ler.nextLine();

		Nodo<Pessoa> head = lista.getHead();

		while (head != lista.getTail()) {
			int cmp = head.getData().getNome().compareTo(nome);
			if (cmp == 0)
				lista.remove(head);
			head = head.getNext();
		}
	}

	public static void pesquisar(ListaOrdenada<Pessoa> lista) {

		ler = new Scanner(System.in);
		String nome;

		out.println("Nome:");
		nome = ler.nextLine();

		Nodo<Pessoa> head = lista.getHead();

		while (head != lista.getTail()) {

			boolean cmp = head.getData().getNome().contains(nome);

			out.println(head.getData().getNome() + " = " + nome);
			out.println(cmp);

			if (cmp = true) {
				out.println("Nome: " + ((Pessoa) head.getData()).getNome()
						+ " Telefone: "
						+ ((Pessoa) head.getData()).getTelefone());
			}
			head = head.getNext();
		}
	}

	public static void main(String[] args) {

		FileManager f = new FileManager();
		String[] linha = f.Read();

		ListaOrdenada<Pessoa> lista = new ListaOrdenada<Pessoa>();
		Nodo<Pessoa> novo = null;

		int i = 0;
		for (String s : linha) {
			String[] tmp = linha[i].split("=");

			Pessoa p = new Pessoa();
			p.setNome(tmp[0]);
			p.setTelefone(tmp[1]);

			Nodo<Pessoa> contato = new Nodo<Pessoa>(p);

			lista.append(contato);
			i++;
		}

		ler = new Scanner(System.in);
		int opcao;

		do {
			out.println("AGENDA");
			out.println("[1] Incluir");
			out.println("[2] Excluir");
			out.println("[3] Listar");
			out.println("[4] Pesquisar");
			out.println("[5] Busca");
			out.println("[0] Encerrar");
			out.println("Opcao: ");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				novo = incluir(lista, novo);
				break;

			case 2:
				excluir(lista);
				break;

			case 3:
				listar(lista);
				break;
			case 4:
				pesquisar(lista);
			}
			System.out.println();
		} while (opcao != 0);

	}

}
