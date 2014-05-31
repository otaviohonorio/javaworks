package com.structure.model;

public class Node<T> {

	public Node<T> leftChild;
	public Node<T> rightChild;
	public T data;
	public int depth = 1;
	public int level;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node(T data, Node<T> left, Node<T> right) {
		
		this.data = data;
		this.leftChild = left;
		this.rightChild = right;
		
		if (left == null && right == null)
			setDepth(1);
		
		else if (left == null)
			setDepth(right.getDepth() + 1);
		
		else if (right == null)
			setDepth(left.getDepth() + 1);
		
		else
			setDepth((Math.max(left.getDepth(), right.getDepth())) + 1);
		
	}
	
	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}

	public Node<T> getLeftChild() {
		return leftChild;
	}

	public Node<T> getRightChild() {
		return rightChild;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

}