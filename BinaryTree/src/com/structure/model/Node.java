package com.structure.model;

public class Node<T> {

	public int key;
	public Node<T> leftChild;
	public Node<T> rightChild;
	public T contact;

	public Node(int key, T contact) {
		this.key = key;
		this.contact = contact;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
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
