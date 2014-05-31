package com.structure.view;

import static java.lang.System.out;

import com.structure.model.Contact;
import com.structure.model.Node;

public class ViewNode {

	public static <T> void inOrder(Node<T> focusNode) {

		if (focusNode != null) {

			inOrder(focusNode.leftChild);

			ViewNode.print(focusNode);

			inOrder(focusNode.rightChild);

		}

	}

	public static <T> void preorder(Node<T> focusNode) {

		if (focusNode != null) {

			ViewNode.print(focusNode);

			preorder(focusNode.leftChild);
			preorder(focusNode.rightChild);

		}

	}

	public static <T> void posOrder(Node<T> focusNode) {

		if (focusNode != null) {

			posOrder(focusNode.leftChild);
			posOrder(focusNode.rightChild);

			ViewNode.print(focusNode);
		}

	}

	public static <T> void print(Node<T> focusNode) {

		out.println("Name: " + ((Contact) focusNode.data).getName() + " Phone:"
				+ ((Contact) focusNode.data).getPhone() + " Deph: "
				+ focusNode.getDepth());

	}

	public static <T> void printContact(T data) {

		out.println("Name: " + ((Contact) data).getName() + " Phone:"
				+ ((Contact) data).getPhone());

	}

}
