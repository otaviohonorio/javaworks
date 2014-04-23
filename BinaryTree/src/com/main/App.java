package com.main;

import static java.lang.System.out;
import java.util.Scanner;
import com.structure.controller.Tree;
import com.structure.model.Contact;
import com.structure.utils.FileManager;
import com.structure.view.ViewNode;

public class App {

	private static Scanner read;

	public static void main(String[] args) {

		Tree<Contact> theTree = new Tree<Contact>();

		FileManager f = new FileManager();
		String[] line = f.Read();

		int i = 0;

		for (int j = 0; j < line.length; j++) {
			
			String[] tmp = line[i].split("=");

			Contact c = new Contact();
			c.setName(tmp[0].trim());
			c.setPhone(tmp[1].trim());

			out.println("HERE!");
			
			theTree.addNode(c);

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
				insert(theTree);
				break;

			case 2:
				// remove();
				break;

			case 3:
				list(theTree);
				break;

			case 4:
				search(theTree);

			}

		} while (opt != 0);

	}

	public static void search(Tree<Contact> theTree) {

		out.println("Name: ");
		String name = read.nextLine();

		ViewNode.print(theTree.findNode(name));

	}

	public static void insert(Tree<Contact> theTree) {

		String name, phone;

		out.println("Name: ");
		name = read.nextLine();
		out.println("Phone: ");
		phone = read.nextLine();

		Contact c = new Contact();
		c.setName(name);
		c.setPhone(phone);

		theTree.addNode(c);

	}

	public static void list(Tree<Contact> theTree) {

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
