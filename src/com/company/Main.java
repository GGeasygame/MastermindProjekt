package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    String[] colour = {"Blue", "Red", "Green", "Yellow", "Purple", "Black", "White", "Grey"};
	    Random random = new Random();
	    int randomColour = random.nextInt(colour.length);
	    System.out.println(randomColour);
	    System.out.println(colour[randomColour]);
    }
}
