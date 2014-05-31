package com.structure.controller;

import com.structure.model.Node;

public class AVLTree<T extends Comparable<T>> extends Tree<T> {

	public Node<T> balance(T data) {
	
		Node<T> node = insert(data);
		
		switch (balanceFactor(node)) {
		case 1:
			node = rotateLeft(node);
			break;
		case -1:
			node = rotateRight(node);
			break;
		default:
			return node;
		}
		return node;
	}

	private int balanceFactor(Node<T> node) {
		int L = depth(node.getLeftChild());
		int R = depth(node.getRightChild());
		if (L - R >= 2)
			return -1;
		else if (L - R <= -2)
			return 1;
		return 0;
	}

	private Node<T> rotateLeft(Node<T> node) {
		Node<T> q = node;
		Node<T> p = q.getRightChild();
		Node<T> c = q.getLeftChild();
		Node<T> a = p.getLeftChild();
		Node<T> b = p.getRightChild();
		q = new Node<T>(q.getData(), c, a);
		p = new Node<T>(p.getData(), q, b);
		return p;
	}

	private Node<T> rotateRight(Node<T> node) {
		Node<T> q = node;
		Node<T> p = q.getLeftChild();
		Node<T> c = q.getRightChild();
		Node<T> a = p.getLeftChild();
		Node<T> b = p.getRightChild();
		q = new Node<T>(q.getData(), b, c);
		p = new Node<T>(p.getData(), a, q);
		return p;
	}

}