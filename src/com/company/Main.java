package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    String[] colour = {"Blue", "Red", "Green", "Yellow", "Purple", "Black", "White", "Grey"};
	    Random random = new Random();
	    int randomColour1 = random.nextInt(colour.length);
	    int randomColour2 = random.nextInt(colour.length);
	    int randomColour3 = random.nextInt(colour.length);
	    int randomColour4 = random.nextInt(colour.length);
	    System.out.println(randomColour1);
	    System.out.println(colour[randomColour1]);
		System.out.println(colour[randomColour2]);
		System.out.println(colour[randomColour3]);
		System.out.println(colour[randomColour4]);
    }

}
