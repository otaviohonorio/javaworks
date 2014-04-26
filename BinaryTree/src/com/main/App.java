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
			out.println("List of Contacts");
			out.println("[1] Insert");
			out.println("[2] Remove");
			out.println("[3] List");
			out.println("[4] Search");
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

			}

			out.println();
			
		} while (opt != 0);

	}

	public static void search(Tree<Contact> theTree) {

		read = new Scanner(System.in);
		
		out.print("Name: ");
		String name = read.nextLine();

		ViewNode.print(theTree.findNode(name));

	}
	
	public static void remove(Tree<Contact> theTree) {

		read = new Scanner(System.in);
		
		out.print("Name: ");
		String name = read.nextLine();

		Node<Contact> root = theTree.getRoot();
		theTree.removeNode(root, name);

	}	
	
	public static void insert(String name, String phone, Tree<Contact> theTree) {

		Contact c = new Contact();
		c.setName(name);
		c.setPhone(phone);

		theTree.addNode(c);

	}
	
	public static void insert(Tree<Contact> theTree) {

		read = new Scanner(System.in);
		String name, phone;

		out.print("Name: ");
		name = read.nextLine();
		out.print("Phone: ");
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
		out.print("Option: ");
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
