package com.senac.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	private String file = "D:\\Eclipse\\Agenda\\agenda.txt";

	public String[] Read() {

		String line = null;
		String tmp = "";

		int i = 0;
		try {
			FileReader reader = new FileReader(file);
			BufferedReader leitor = new BufferedReader(reader);
			while ((line = leitor.readLine()) != null) {
				tmp = tmp + line + ";";
				i++;
			}
			leitor.close();
			reader.close();
		} catch (Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		String [] linha = new String[i];
		linha = tmp.split(";");

		return linha;
	}

	public void Write(String name, String number) {
		try {
			FileWriter fw = new FileWriter(file,true);
			fw.append("\n" + name + " = " + number);
			fw.close();
		} catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
}
