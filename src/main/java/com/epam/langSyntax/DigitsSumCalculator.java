package com.epam.langSyntax;

public class DigitsSumCalculator {

	public void calculateSum(int number) {
		char[] numbers = Integer.toString(number).toCharArray();
		int sum = 0;
		for (int index = numbers.length; index > 0; index--) {
			sum += Integer.valueOf(String.valueOf(numbers[index - 1]));
		}
		System.out.println(sum);

	}

}
