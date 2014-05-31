package com.structure.controller;

import com.structure.model.Node;

public class AVLTree<T extends Comparable<T>> extends Tree<T> {
 
	public T Maximum() {
		Node<T> local = root;
		if (local == null)
			return null;
		while (local.getRightChild() != null)
			local = local.getRightChild();
		return local.getData();
	}
 
	public T Minimum() {
		Node<T> local = root;
		if (local == null)
			return null;
		while (local.getLeftChild() != null) {
			local = local.getLeftChild();
		}
		return local.getData();
	}
  
	public Node<T> insert(T data) {
		root = insert(root, data);
		switch (balanceFactor(root)) {
		case 1:
			root = rotateLeft(root);
			break;
		case -1:
			root = rotateRight(root);
			break;
		default:
			break;
		}
		return root;
	}
 
	public Node<T> insert(Node<T> node, T data) {
		if (node == null)
			return new Node<T>(data);
		if (node.getData().compareTo(data) > 0) {
			node = new Node<T>(node.getData(), insert(node.getLeftChild(), data),
					node.getRightChild());
			// node.setLeft(insert(node.getLeft(), data));
		} else if (node.getData().compareTo(data) < 0) {
			// node.setRight(insert(node.getRight(), data));
			node = new Node<T>(node.getData(), node.getLeftChild(), insert(
					node.getRightChild(), data));
		}
		// After insert the new node, check and rebalance the current node if
		// necessary.
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