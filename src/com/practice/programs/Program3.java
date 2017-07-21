package com.practice.programs;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter string1");
		String str1 = scan.nextLine();
		System.out.println("enter string2");
		String str2 = scan.next();
		// String str="";

		char[] first = str1.toCharArray();
		char[] second = str2.toCharArray();

		for (int i = 0; i < first.length; i++) {

			for (int j = 0; j < second.length; j++) {

				if (first[i] == second[j]) {
					second[j] = ' ';
				}

			}
		}
		System.out.println(String.valueOf(second).trim());

		scan.close();
	}

}