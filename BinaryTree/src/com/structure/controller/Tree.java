package com.structure.controller;

import com.structure.model.Node;
import com.structure.view.ViewNode;

public class Tree<T> {

	Node<T> root;

	public Node<T> getRoot() {
		return root;
	}

	public void addNode(int key, T data) {

		Node<T> newNode = new Node<T>(key, data);

		if (root == null) {

			root = newNode;

		} else {

			Node<T> focusNode = root;

			Node<T> parent;

			while (true) {

				parent = focusNode;

				if (key < focusNode.getKey()) {

					focusNode = focusNode.getLeftChild();

					if (focusNode == null) {

						parent.leftChild = newNode;
						return;

					}

				} else {

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

	public Node<T> findNode(int key) {

		Node<T> focusNode = root;

		while (focusNode.key != key) {

			if (key < focusNode.key) {

				focusNode = focusNode.leftChild;

			} else {

				focusNode = focusNode.rightChild;

			}

			if (focusNode == null)
				return null;

		}

		return focusNode;

	}

}