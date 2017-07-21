package com.practice.programs;

public class Program1 {
	public static void main(String[] args) {
		String word = "This is Full Creative";
		String[] alphabets = word.split("\\s");
		int length;
		for (int k = 0; k < alphabets.length; k++) {

			length = alphabets[k].length();

			for (int i = 0; i < length; i++) {

				for (int j = 0; j < i; j++) {
					char inner = alphabets[k].charAt(j);
					System.out.printf("%c ",inner);
					

				}
				System.out.printf("%c\n", alphabets[k].charAt(i));

			}
			
		}
	}
}
