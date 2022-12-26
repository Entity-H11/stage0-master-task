package com.epam.langSyntax;

public class NumberReverter {

	public void revert(int number) {

		char[] numberToRevert = Integer.toString(number).toCharArray();
		int length = numberToRevert.length;
		String numberReverted = "";

		while (length > 0) {
			numberReverted += numberToRevert[length - 1];
			length--;
		}
		
		System.out.println(Integer.parseInt(numberReverted));
	}

}
