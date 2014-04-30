package com.structure.model;

public class Node<T> {

	public Node<T> leftChild;
	public Node<T> rightChild;
	public T contact;
	public int c;

	public Node(T contact) {
		this.contact = contact;
	}

	public T getContact() {
		return contact;
	}

	public void setContact(T contact) {
		this.contact = contact;
	}

}
