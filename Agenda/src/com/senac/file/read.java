package com.senac.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.senac.contatos.Pessoa;

public class read {

	private String file = "/home/otto/workspace/contatos.txt";
	public String contatos[];

	public String[] Read() {

		int i = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line;

			while ((line = br.readLine()) != null) {
				contatos[i++] = line;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return contatos;
	}

	public void export() {

		String array[] = Read();

		for (int i = 0; i < array.length - 1; i++) {
			String element = array[i];
			String nextElement = array[i + 1];
			criarContato(element, nextElement);
		}
	}
}
