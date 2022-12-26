package com.epam.conditions;

public class TriangleSidesValidator {

	public void validate(double firstSide, double secondSide, double thirdSide) {

		boolean thirdIsValid = firstSide + secondSide > thirdSide;
		boolean secondIsValid = firstSide + thirdSide > secondSide;
		boolean firstIsValid = secondSide + thirdSide > firstSide;
		if (thirdIsValid && secondIsValid && firstIsValid) {
			System.out.println("this is a valid triangle");
		} else {
			System.out.println("it's not a triangle");
		}

	}

}
