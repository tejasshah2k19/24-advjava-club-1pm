package com.google.util;

public class RnD {

	public static void main(String[] args) {

		// input -> format ->

		// name => alphabet
		// age => digit
		// birthyear => digit

		// email => alpha-num-special -> XX@XX.XX

		// regular expression -> regEx
		// input:format->validate

		String digitRegEx = "[0-9]{4}";// input digit - only 4 digit

		String birthYear = "0000";

		System.out.println(birthYear.matches(digitRegEx));// true false

	}
}
