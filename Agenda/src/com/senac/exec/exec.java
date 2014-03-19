package com.senac.exec;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.senac.estrutura.lista.ListaOrdenada;
import com.senac.model.*;

public class exec {

	private static Scanner ler;

	private static Nodo<String> incluir(ListaOrdenada<String> lista, Nodo<String> novo) {
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
		
		FileManager f = new FileManager();
		f.Write(nome,fone);
		
		return novo;
	}

	/*private static Nodo<String> excluir(ListaOrdenada<String> lista, Nodo<String> novo) {
		ler = new Scanner(System.in);
		String nome;
		out.println("Nome:");
		nome = ler.nextLine();
		
		
	}
	*/
		
	private static void listar(ListaOrdenada<String> lista) {
		lista.print();
	}
	
	public static void main(String[] args) {

		FileManager f = new FileManager();
		String[] linha = f.Read();
						
		ListaOrdenada<String> lista = new ListaOrdenada<String>();
		Nodo<String> novo = null;

		int i = 0;
		for(String s: linha){
			String [] tmp = linha[i].split("=");
			lista.append(new Nodo<String>(tmp[0], tmp[1]));
			i++;
		}
		
		ler = new Scanner(System.in);
		int opcao;

		try{
			do {
				out.println("AGENDA");
				out.println("[1] Incluir");
				out.println("[2] Excluir");
				out.println("[3] Listar");
				out.println("[4] Pesquisar");
				out.println("[0] Encerrar");
				out.println("Opcao Desejada: ");
				opcao = ler.nextInt();
	
				switch (opcao) {
				case 1:
					novo = incluir(lista, novo);
					break;
				/*case 2: 
					excluir(); 
					break;
				*/
				case 3:
					listar(lista);
					break;
				//case 4: pesquisar(lista);
				}
				System.out.println();
			} while (opcao != 0);
		} catch (InputMismatchException e) {
			System.out.println("Opcao invalida: " + e.getMessage());
		}

	}

}
