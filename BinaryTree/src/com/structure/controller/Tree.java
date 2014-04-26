package com.structure.controller;

import com.structure.model.Contact;
import com.structure.model.Node;
import com.structure.view.ViewNode;

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

				int cmp = ((Contact) focusNode.contact).getName().compareTo(
						((Contact) data).getName());

				if (cmp > 0) {

					focusNode = focusNode.getLeftChild();

					if (focusNode == null) {

						parent.leftChild = newNode;
						return;

					}

				} else if (cmp < 0) {

					focusNode = focusNode.rightChild;

					if (focusNode == null) {

						parent.rightChild = newNode;
						return;

					}

				} else {

					break;

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

		while (true) {

			if (focusNode == null) {

				return null;

			}

			int cmp = ((Contact) focusNode.contact).getName().compareTo(name);
			
			if (cmp > 0) {

				focusNode = focusNode.leftChild;

			} else if (cmp < 0) {

				focusNode = focusNode.rightChild;

			} else {

				return focusNode;
				
			}

		}
	}

}