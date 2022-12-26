package com.epam.OOP;

public class Animal {

	private String color;
	private int numberOfPaws;
	private boolean hasFur;

	public Animal(String color, int numberOfPaws, boolean hasFur) {
		this.color = color;
		this.numberOfPaws = numberOfPaws;
		this.hasFur = hasFur;

	}

	public String getDescription() {

		StringBuilder description = new StringBuilder("This animal is mostly ").append(color).append(". It has ").append(numberOfPaws)
				.append(numberOfPaws < 2 ? " paw" : " paws").append(" and ").append(hasFur ? "a" : "no").append(" fur.");
		return description.toString();
	}
}
