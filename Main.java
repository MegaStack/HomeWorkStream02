package com.gmail.oastro36;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		File inA = new File("a.txt");
		File inB = new File("b.txt");
		
		System.out.print("File a: ");
		String[] arrayInA = MyFileLoader.getWords(inA);
		for (String string : arrayInA) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		System.out.print("File b: ");
		String[] arrayInB = MyFileLoader.getWords(inB);
		for (String string : arrayInB) {
			System.out.print(string + " ");
		}
		System.out.println();
				
		String resultText = compareMyWords(arrayInA, arrayInB);
		System.out.println(resultText);
		creatFile(resultText);
	}

	public static String compareMyWords(String[] a, String[] b) {
		StringBuilder sb = new StringBuilder();
		
		for (String string : a) {
			for (String string2 : b) {			
				if (string.equalsIgnoreCase(string2)) {
					sb.append(string + " ");
				}
			}
		}

		return sb.toString();

	}

	public static void creatFile(String text) {
		try (PrintWriter pw = new PrintWriter("c.txt")) {
			pw.print(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
