package com.structure.controller;

import java.util.LinkedList;
import java.util.Queue;

import com.structure.model.Contact;
import com.structure.model.Node;
import com.structure.view.ViewNode;

public class Tree<T extends Comparable<T>> {

	Node<T> root;

	public Node<T> getRoot() {
		return root;
	}

	public Node<T> addNode(T data) {

		Node<T> newNode = new Node<T>(data);

		if (root == null) {

			root = newNode;

		} else {

			Node<T> focusNode = root;

			Node<T> parent;

			while (true) {

				parent = focusNode;

				int cmp = ((Contact) focusNode.contact).getName().compareTo(
						((Contact) data).getName());

				if (cmp > 0) {

					focusNode = focusNode.leftChild;

					if (focusNode == null) {

						parent.leftChild = newNode;
						break;

					}

				} else if (cmp < 0) {

					focusNode = focusNode.rightChild;

					if (focusNode == null) {

						parent.rightChild = newNode;
						break;

					}

				} else {

					break;

				}

			}

		}

		return newNode;

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

	public int height(Node<T> focusNode) {

		if (focusNode == null)
			return 0;

		int heightLeft = height(focusNode.leftChild);
		int heightRight = height(focusNode.rightChild);

		if (heightLeft > heightRight)
			return heightLeft + 1;
		else
			return heightRight + 1;

	}

	public int count(Node<T> focusNode) {

		if (focusNode == null)
			return 0;

		int countLeft = count(focusNode.leftChild);
		int countRight = count(focusNode.rightChild);

		return countRight + countLeft + 1;

	}

	public Node<Contact> removeNode(Node<Contact> focusNode, String name) {

		Node<Contact> p, p2;

		int cmp = ((Contact) focusNode.contact).getName().compareTo(name);

		if (cmp == 0) {

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

		} else if (cmp < 0) {

			focusNode.rightChild = removeNode(focusNode.rightChild, name);

		} else {

			focusNode.leftChild = removeNode(focusNode.leftChild, name);

		}

		return focusNode;

	}

	public Node<T> findNode(String name) {

		Node<T> focusNode = root;
		int i = 1;

		while (true) {

			if (focusNode == null) {
				i++;
				return null;

			}

			int cmp = ((Contact) focusNode.contact).getName().compareTo(name);

			if (cmp > 0) {
				i++;
				focusNode = focusNode.leftChild;

			} else if (cmp < 0) {
				i++;
				focusNode = focusNode.rightChild;

			} else {
				i++;
				break;
			}

		}

		focusNode.c = i;
		return focusNode;

	}

	public Node<T> breadth(Node<T> focusNode, String name) {

		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		int i = 0;

		if (focusNode == null) {
			i++;
			return null;
		}

		queue.clear();
		queue.add(focusNode);

		while (!queue.isEmpty()) {

			Node<T> n = (Node<T>) queue.remove();

			int cmp = ((Contact) n.contact).getName().compareTo(name);

			i++;

			if (cmp == 0) {

				focusNode = n;
				break;

			}

			if (n.leftChild != null)
				queue.add(n.leftChild);

			if (n.rightChild != null)
				queue.add(n.rightChild);

		}

		focusNode.c = i;
		return focusNode;

	}

}