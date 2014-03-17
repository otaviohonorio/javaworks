package com.senac.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	private String file = "/home/otto/workspace/contatos.txt";
	private String arrays[];

	public String[] Read() {

		arrays = null;
		String line = "";
		int i = 0;
		try {
			FileReader reader = new FileReader(file);
			BufferedReader leitor = new BufferedReader(reader);
			while ((line = leitor.readLine()) != null) {
				i = i + 1;
				arrays[i] = leitor.readLine();
				
				//System.out.println(i+" - "+line);
			}
			leitor.close();
			reader.close();
		} catch (Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		return arrays;
	}

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
