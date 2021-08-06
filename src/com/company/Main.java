package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
    	//colour generator
	    String[] colour = {"Blue", "Red", "Green", "Yellow", "Purple", "Black", "White", "Grey"};
	    Random random = new Random();
	    int rc1 = random.nextInt(colour.length);
	    int rc2 = random.nextInt(colour.length);
	    int rc3 = random.nextInt(colour.length);
	    int rc4 = random.nextInt(colour.length);

		String randomColour1 = colour[rc1];
		String randomColour2 = colour[rc2];
		String randomColour3 = colour[rc3];
		String randomColour4 = colour[rc4];

		Abgleichung(randomColour1, randomColour2, randomColour3, randomColour4);

    }

    public static void Abgleichung(String randomColour1, String randomColour2, String randomColour3, String randomColour4) { //scanner einfügen
    	if (scanner1 == ) {

		}
	}
}
