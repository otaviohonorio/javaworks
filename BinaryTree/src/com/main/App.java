package com.main;

import static java.lang.System.out;

import java.util.Scanner;

import com.structure.controller.Tree;
import com.structure.model.Contact;
import com.structure.model.Node;
import com.structure.utils.FileManager;
import com.structure.view.ViewNode;

public class App {

	private static Scanner read;

	public static void main(String[] args) {

		Tree<Contact> theTree = new Tree<Contact>();

		FileManager f = new FileManager();

		String[] line = f.Read();

		for (int j = 0; j < line.length; j++) {

			String[] tmp = line[j].split("=");

			insert(tmp[0], tmp[1], theTree);

		}

		read = new Scanner(System.in);
		int opt;

		do {
			out.println("\nList of Contacts");
			out.println("[1] Insert");
			out.println("[2] Remove");
			out.println("[3] List");
			out.println("[4] Search");
			out.println("[5] Breadth");
			out.println("[0] Exit");
			out.print("Option: ");
			opt = read.nextInt();

			switch (opt) {

			case 1:
				insert(theTree);
				break;

			case 2:
				remove(theTree);
				break;

			case 3:
				list(theTree);
				break;

			case 4:
				search(theTree);
				break;

			case 5:
				breadth(theTree);

			}

			out.println();

		} while (opt != 0);

	}

	public static void search(Tree<Contact> theTree) {

		read = new Scanner(System.in);

		out.print("Name: ");
		String name = read.nextLine();

		ViewNode.printContact(theTree.search(name));

	}

	public static void breadth(Tree<Contact> theTree) {

		read = new Scanner(System.in);

		out.print("Name: ");
		String name = read.nextLine();

		ViewNode.printContact(theTree.breadth(theTree.getRoot(), name));

	}

	public static void remove(Tree<Contact> theTree) {

		read = new Scanner(System.in);

		out.print("Name: ");
		String name = read.nextLine();

		theTree.remove(theTree.getRoot(), name);

	}

	public static void insert(String name, String phone, Tree<Contact> theTree) {

		Contact contact = new Contact();
		contact.setName(name);
		contact.setPhone(phone);

		Node<Contact> node = theTree.insert(contact);
		
		out.println("Contact (" + name + ") inserted. Node level: "+ node.getDepth());

	}

	public static void insert(Tree<Contact> theTree) {

		read = new Scanner(System.in);
		String name, phone;

		out.print("Name: ");
		name = read.nextLine();
		out.print("Phone: ");
		phone = read.nextLine();

		Contact contact = new Contact();
		contact.setName(name);
		contact.setPhone(phone);

		FileManager f = new FileManager();
		f.Write(name, phone);
		
		theTree.insert(contact);

	}

	public static void list(Tree<Contact> theTree) {

		int opt;

		out.println("\nListing");
		out.println("[1] In-Order");
		out.println("[2] Pre-Order ");
		out.println("[3] Pos-Order");
		out.print("Option: ");
		opt = read.nextInt();

		switch (opt) {

		case 1:
			ViewNode.inOrder(theTree.getRoot());
			break;

		case 2:
			ViewNode.preorder(theTree.getRoot());
			break;

		case 3:
			ViewNode.posOrder(theTree.getRoot());

		}

		return;
	}

}