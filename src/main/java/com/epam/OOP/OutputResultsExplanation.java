package com.epam.OOP;

public class OutputResultsExplanation {

	public static void main(String[] args) {
		Animal animal = new Animal("Brown and White", 4, true);
		Dog dog = new Dog();
		Bird bird = new Bird();

		/*
		 * The reason behind those outputs is the Polymorphism principle. This enable to
		 * apply or replace an additional behavior or value to other implementations,
		 * overriding the initial declaration. For example Birds extends the initial
		 * behavior of getDescription from Animal, and then, adds his own behavior. But
		 * in the case of Dog class, does not override it, just hold the main behavior
		 * inherited from the Animal class.
		 */
		System.out.println(animal.getDescription());
		System.out.println(dog.getDescription());
		System.out.println(bird.getDescription());
	}
}
