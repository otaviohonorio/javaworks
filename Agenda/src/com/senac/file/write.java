package com.senac.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class write {

	private String file = "/home/otto/workspace/contatos.txt";
	
	public void Write(String name, String number) {
		try {

			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(name);
			bw.newLine();
			bw.write(number);
			bw.close();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
