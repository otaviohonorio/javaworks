package com.structure.controller;

import com.structure.model.Contact;
import com.structure.model.Node;
import com.structure.view.ViewNode;

/*

 int x = abc.compareTo(abc1);

 x será negativo, pois a string abc é menor que a abc1. 
 x será 0, ambas são idênticas. 
 x será positivo, abc é maior que abc1 

 */

public class Tree<T extends Comparable<T>> {

	Node<T> root;

	public Node<T> getRoot() {
		return root;
	}

	public void addNode(T data) {

		Node<T> newNode = new Node<T>(data);

		if (root == null) {

			root = newNode;

		} else {

			Node<T> focusNode = root;

			Node<T> parent;

			while (true) {

				parent = focusNode;
				
				int cmp = newNode.getContact().compareTo(data);
				
				if (cmp < 0) {

					focusNode = focusNode.getLeftChild();

					if (focusNode == null) {

						parent.leftChild = newNode;
						return;

					}

				} else if (cmp > 0) {

					focusNode = focusNode.rightChild;

					if (focusNode == null) {

						parent.rightChild = newNode;
						return;

					}

				}

			}
			
		}

	}

	public void inOrder(Node<T> focusNode) {

		if (focusNode != null) {

			inOrder(focusNode.leftChild);

			ViewNode.print(focusNode);

			inOrder(focusNode.rightChild);

		}

	}

	public void preorder(Node<T> focusNode) {

		if (focusNode != null) {

			ViewNode.print(focusNode);

			preorder(focusNode.leftChild);
			preorder(focusNode.rightChild);

		}

	}

	public void posOrder(Node<T> focusNode) {

		if (focusNode != null) {

			posOrder(focusNode.leftChild);
			posOrder(focusNode.rightChild);

			ViewNode.print(focusNode);
		}

	}

	public Node<T> findNode(String name) {

		Node<T> focusNode = root;
		
		int cmp = ((Contact) focusNode.contact).getName().compareTo(name);
		
		while (cmp != 0) {

			if (cmp < 0) {

				focusNode = focusNode.leftChild;

			} else if (cmp > 0) {

				focusNode = focusNode.rightChild;

			}

			if (focusNode == null)
				return null;

		}

		return focusNode;

	}

}