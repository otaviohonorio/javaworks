package com.structure.model;

public class Node<T> {

	public Node<T> leftChild;
	public Node<T> rightChild;
	public T contact;

	public Node(T contact) {
		this.contact = contact;
	}

	public T getContact() {
		return contact;
	}

	public void setContact(T contact) {
		this.contact = contact;
	}

	public Node<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}

	public Node<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	
}
