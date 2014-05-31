package com.structure.view;

import static java.lang.System.out;

import com.structure.model.Contact;
import com.structure.model.Node;

public class View {

	public static <T> void inOrder(Node<T> focusNode) {

		if (focusNode != null) {

			inOrder(focusNode.leftChild);

			View.print(focusNode);

			inOrder(focusNode.rightChild);

		}

	}

	public static <T> void preorder(Node<T> focusNode) {

		if (focusNode != null) {

			View.print(focusNode);

			preorder(focusNode.leftChild);
			preorder(focusNode.rightChild);

		}

	}

	public static <T> void posOrder(Node<T> focusNode) {

		if (focusNode != null) {

			posOrder(focusNode.leftChild);
			posOrder(focusNode.rightChild);

			View.print(focusNode);
		}

	}

	public static <T> void print(Node<T> focusNode) {

		out.println("Name: " + ((Contact) focusNode.getData()).getName() + " Phone:"
				+ ((Contact) focusNode.getData()).getPhone() + " Deph: "
				+ focusNode.getDepth());

	}

	public static <T> void printContact(T data) {

		out.println("Name: " + ((Contact) data).getName() + " Phone:"
				+ ((Contact) data).getPhone());

	}

}
