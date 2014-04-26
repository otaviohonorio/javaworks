package com.structure.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	private String dir = System.getProperty("user.dir");
	private String file = dir+"/agenda.txt";
	
	public String[] Read() {

		String line = null;
		String tmp = "";

		int i = 0;
		
		try {
			
			FileReader f = new FileReader(file);
			BufferedReader r = new BufferedReader(f);
			
			while ((line = r.readLine()) != null) {
				tmp = tmp + line + ";";
				i++;
			}
		
			r.close();
			f.close();
		
		} catch (Exception e) {
		
			System.out.println("Error: "+ e.getMessage());
		
		}
	
		String [] l = new String[i];
		l = tmp.split(";");

		return l;
	}

	public void Write(String name, String number) {
		
		try {
			
			FileWriter f = new FileWriter(file,true);
			f.append("\n" + name + " = " + number);
			f.close();
			
		} catch (IOException e) {
			
			System.out.println("Error: "+ e.getMessage());
		
		}
		
	}
	
}
