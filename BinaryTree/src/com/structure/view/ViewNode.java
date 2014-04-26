package com.structure.view;

import static java.lang.System.out;

import com.structure.model.Contact;
import com.structure.model.Node;

public class ViewNode {

	public static <T> void print (Node<T> focusNode) {
				
		out.println("Name: "+((Contact) focusNode.contact).getName()+" Phone:"+((Contact) focusNode.contact).getPhone());
		
	}
	
}
