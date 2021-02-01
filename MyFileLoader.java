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
				sb.append(text.replaceAll("[,.()]", "") + " ");
			}
			String allText = sb.toString();
			String[] arrayAllText = allText.split("[ ]");
			return arrayAllText;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
