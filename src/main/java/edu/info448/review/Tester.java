package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));
		Husky husky = new Husky("Dubs");
		husky.pullSled();
		husky.bark();
		GiftBox<Husky> huskyGift = new GiftBox<Husky>(husky);
	}
}
