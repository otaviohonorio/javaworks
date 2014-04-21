package com.main;

import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

import com.structure.controller.Tree;
import com.structure.model.Contact;
import com.structure.utils.FileManager;
import com.structure.view.ViewNode;

public class App {

	private static Scanner read;
	static Tree<Contact> theTree = new Tree<Contact>();

	public static void main(String[] args) {

		FileManager f = new FileManager();
		String[] linha = f.Read();

		int i = 0;

		for (String s : linha) {

			String[] tmp = linha[i].split("=");

			Contact c = new Contact();
			c.setName(tmp[0].trim());
			c.setPhone(tmp[1].trim());

			theTree.addNode(i, c);

			i++;
		}

		read = new Scanner(System.in);
		int opt;

		do {
			out.println("List of Contacts");
			out.println("[1] Insert");
			out.println("[2] Remove");
			out.println("[3] List");
			out.println("[4] Search");
			out.println("[0] Exit");
			out.println("Option: ");
			opt = read.nextInt();

			switch (opt) {

			case 1:
				insert();
				break;

			case 2:
				// remove();
				break;

			case 3:
				list();
				break;

			case 4:
				search();

			}

		} while (opt != 0);

	}

	public static void search() {

		// out.println("Name:");
		// String name = read.nextLine();

		out.println("Key:");
		int key = read.nextInt();

		ViewNode.print(theTree.findNode(key));

	}

	public static void insert() {

		String name, phone;

		out.println("Name:");
		name = read.nextLine();
		out.println("Phone:");
		phone = read.nextLine();

		Contact c = new Contact();
		c.setName(name);
		c.setPhone(phone);

		Random i = new Random();
		int key = i.nextInt(20);
		theTree.addNode(key, c);

	}

	public static void list() {

		int opt;

		out.println("Listing");
		out.println("[1] In-Order");
		out.println("[2] Pre-Order ");
		out.println("[3] Pos-Order");
		out.println("[0] Back");
		out.println("Option: ");
		opt = read.nextInt();

		switch (opt) {

		case 1:
			theTree.inOrder(theTree.getRoot());
			break;

		case 2:
			theTree.preorder(theTree.getRoot());
			break;

		case 3:
			theTree.posOrder(theTree.getRoot());

		}

		return;
	}

}
