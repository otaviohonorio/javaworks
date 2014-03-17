package com.senac.app;

import java.util.Scanner;

public class Tela {

	private Scanner console;

	public int menuPrincipal() {
		console = new Scanner(System.in);
		System.out.println("1. Mostrar");
		System.out.println("2. Adicionar");
		System.out.println("3. Remover");
		System.out.println("4. Encerrar");
		int op = console.nextInt();
		System.out.println(op);
		return op;
	}
}
