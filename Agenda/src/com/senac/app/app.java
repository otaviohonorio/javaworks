package com.senac.app;

import static java.lang.System.out;

import java.util.ArrayList;
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
		p.setTelefone(fone);

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

	public static void buscar(ListaOrdenada<Pessoa> lista) {

		ler = new Scanner(System.in);
		String nome;

		out.println("Nome:");
		nome = ler.nextLine();

		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> fones = new ArrayList<String>();
		
		Nodo<Pessoa> elem = lista.getHead();
		do {
			names.add(((Pessoa) elem.getData()).getNome());
			fones.add(((Pessoa) elem.getData()).getTelefone());
			elem = elem.getNext();
		} while (elem != null);

		int first = 0;
		int last = names.size();
		
		while (first < last) {
			int mid = first + ((last - first) / 2);
			if (nome.compareTo(names.get(mid)) < 0) {
				last = mid - 1;
			} else if (nome.compareTo(names.get(mid)) > 0) {
				first = mid + 1;
			} else {
				first = mid;
				break;
			}
		}
		int r = (first);
		out.println("Nome: "+names.get(r)+" Fone: "+fones.get(r));
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

		Nodo<Pessoa> elem = lista.getHead();
		do {
			boolean cmp = elem.getData().getNome().toLowerCase()
					.contains(nome.toLowerCase());
			if (cmp == true) {
				out.println("Nome: " + ((Pessoa) elem.getData()).getNome()
						+ " Fone: " + ((Pessoa) elem.getData()).getTelefone());
			}
			elem = elem.getNext();
		} while (elem != null);

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
			p.setNome(tmp[0].trim());
			p.setTelefone(tmp[1].trim());

			Nodo<Pessoa> contato = new Nodo<Pessoa>(p);

			lista.append(contato);
			i++;
		}

		ler = new Scanner(System.in);
		int opt;

		do {
			out.println("AGENDA");
			out.println("[1] Incluir");
			out.println("[2] Excluir");
			out.println("[3] Listar");
			out.println("[4] Pesquisar");
			out.println("[5] Busca Binaria");
			out.println("[0] Encerrar");
			out.println("Opcao: ");
			opt = ler.nextInt();

			switch (opt) {
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
				break;

			case 5:
				buscar(lista);
			}

			System.out.println();
		} while (opt != 0);
	}
}
