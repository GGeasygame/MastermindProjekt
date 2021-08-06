package com.company;

import java.util.Random;

import java.util.Scanner;

public class Main {
    public static String colour1;
    public static String colour2;
    public static String colour3;
    public static String colour4;
    public static void main(String[] args) {
        //colour generator
        String[] colour = {"Blue", "Red", "Green", "Yellow", "Purple", "Black", "White", "Grey"};
        Random random = new Random();
        int rc1 = random.nextInt(colour.length);
        int rc2 = random.nextInt(colour.length);
        int rc3 = random.nextInt(colour.length);
        int rc4 = random.nextInt(colour.length);

        System.out.println(colour[rc1]);
        System.out.println(colour[rc2]);
        System.out.println(colour[rc3]);
        System.out.println(colour[rc4]);

        String randomColour1 = colour[rc1];
        String randomColour2 = colour[rc2];
        String randomColour3 = colour[rc3];
        String randomColour4 = colour[rc4];

        int counter = 0;
        if (counter == 12){
            System.out.println("Verloren, Sie haben alle Ihre Versuche aufgebraucht!");
            System.exit(0);
        } else if (counter == 1)

        scanner();
        Abgleichung(randomColour1, randomColour2, randomColour3, randomColour4, colour1, colour2, colour3, colour4, counter);
    }
//Spieler wählt Farben
    public static String scanner() {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Geben Sie Ihre erste Farbe ein:");
        colour1 = scanner1.next();

        System.out.println("Geben Sie Ihre zweite Farbe ein:");
		colour2 = scanner1.next();

		System.out.println("Geben Sie Ihre dritte Farbe ein:");
		colour3 = scanner1.next();

		System.out.println("Geben Sie Ihre vierte Farbe ein:");
		colour4 = scanner1.next();

		return colour1 + colour2 + colour3 + colour4;
    }
//Vergleich von gewählten Farben mit computergenerierten Farben
    public static void Abgleichung(String randomColour1, String randomColour2, String randomColour3, String randomColour4, String colour1, String colour2, String colour3, String colour4, int counter) { //scanner einfügen
        int korrekt = 0;
        int vollKorrekt = 0;


        if (colour1.equals(randomColour1) || colour1.equals(randomColour2) || colour1.equals(randomColour3) || colour1.equals(randomColour4)) {
            korrekt++;
        }
        if (colour2.equals(randomColour1) || colour2.equals(randomColour2) || colour2.equals(randomColour3) || colour2.equals(randomColour4)) {
            korrekt++;
        }
        if (colour3.equals(randomColour1) || colour3.equals(randomColour2) || colour3.equals(randomColour3) || colour3.equals(randomColour4)) {
            korrekt++;
        }
        if (colour4.equals(randomColour1) || colour4.equals(randomColour2) || colour4.equals(randomColour3) || colour4.equals(randomColour4)) {
            korrekt++;
        }
        if (colour1.equals(randomColour1)) {
            vollKorrekt++;
        }
        if (colour2.equals(randomColour2)) {
            vollKorrekt++;
        }
        if (colour3.equals(randomColour3)) {
            vollKorrekt++;
        }
        if (colour4.equals(randomColour4)) {
            vollKorrekt++;
        }
        if (vollKorrekt == 4) {
            System.out.println("Gratulation, Sie haben gewonnen und haben " + counter + " Versuche gebraucht.");
        } else {
            System.out.println("Sie haben " + korrekt + " Farben korrekt.");
            System.out.println("Sie haben " + vollKorrekt + " Farben korrekt und an richtiger Stelle.");
        }

    }
}
