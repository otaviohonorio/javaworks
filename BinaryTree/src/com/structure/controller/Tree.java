package com.structure.controller;

import java.util.LinkedList;
import java.util.Queue;

import com.structure.model.Contact;
import com.structure.model.Node;

public class Tree<T extends Comparable<T>> {

	Node<T> root;

	public Node<T> getRoot() {
		return root;
	}

	public Node<T> insert(T data) {
		root = insert(root, data);
		return root;
	}

	public Node<T> insert(Node<T> focusNode, T data) {

		if (focusNode == null)
			return new Node<T>(data);

		if (focusNode.getData().compareTo(data) > 0) {
			focusNode = new Node<T>(focusNode.getData(), insert(
					focusNode.getLeftChild(), data), focusNode.getRightChild());

		} else if (focusNode.getData().compareTo(data) < 0) {
			focusNode = new Node<T>(focusNode.getData(),
					focusNode.getLeftChild(), insert(focusNode.getRightChild(),
							data));
		}

		return focusNode;
	}

	public int depth(Node<T> focusNode) {

		if (focusNode == null)
			return 0;

		return focusNode.getDepth();

	}

	public Node<T> remove(Node<T> focusNode, String name) {

		Node<T> p;
		Node<T> p2;

		if ((((Contact) focusNode.data).getName().compareTo(name)) == 0) {

			if (focusNode.leftChild == focusNode.rightChild) {

				return null;

			} else if (focusNode.leftChild == null) {

				return focusNode.rightChild;

			} else if (focusNode.rightChild == null) {

				return focusNode.leftChild;

			} else {

				p2 = focusNode.rightChild;
				p = focusNode.rightChild;

				while (p.leftChild != null) {

					p = p.leftChild;

				}

				p.leftChild = focusNode.leftChild;

				return p2;
			}

		} else if (((Contact) focusNode.data).getName().compareTo(name) < 0) {

			focusNode.rightChild = remove(focusNode.rightChild, name);

		} else {

			focusNode.leftChild = remove(focusNode.leftChild, name);

		}

		return focusNode;

	}

	public Node<T> search(String name) {

		Node<T> focusNode = root;

		while (true) {

			if (focusNode == null) {
				return null;

			}

			int cmp = ((Contact) focusNode.data).getName().compareTo(name);

			if (cmp > 0) {
				focusNode = focusNode.leftChild;

			} else if (cmp < 0) {
				focusNode = focusNode.rightChild;

			} else {
				break;
			}

		}

		return focusNode;

	}

	public Node<T> breadth(Node<T> focusNode, String name) {

		Queue<Node<T>> queue = new LinkedList<Node<T>>();

		if (focusNode == null) {
			return null;
		}

		queue.clear();
		queue.add(focusNode);

		while (!queue.isEmpty()) {

			Node<T> n = (Node<T>) queue.remove();

			int cmp = ((Contact) n.data).getName().compareTo(name);

			if (cmp == 0) {

				focusNode = n;
				break;

			}

			if (n.leftChild != null)
				queue.add(n.leftChild);

			if (n.rightChild != null)
				queue.add(n.rightChild);

		}

		return focusNode;

	}

}