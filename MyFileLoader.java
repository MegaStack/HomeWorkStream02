package com.gmail.oastro36;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFileLoader {

	public static String[] getWords(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			StringBuilder sb = new StringBuilder();
			String text = "";
			for (; (text = br.readLine()) != null;) {
				sb.append(text);
			}
			String allText = sb.toString();
			String[] arrayAllText = allText.split("[ ]");
			for (String string : arrayAllText) {
				System.out.print(string + " ");
			}
			System.out.println();
			return arrayAllText;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
