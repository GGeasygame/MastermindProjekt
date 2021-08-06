package com.company;

import java.util.Random;

import java.util.Scanner;

public class Main {
    public static String colour1;
    public static String colour2;
    public static String colour3;
    public static String colour4;
    public static Boolean restart = true;
    public static void main(String[] args) {

        do {
            //colour generator
            String[] colour = {"Blau", "Rot", "Grün", "Gelb", "Violet", "Schwarz", "Weiss", "Grau"};
            Random random = new Random();
            int rc1 = random.nextInt(colour.length);
            int rc2 = random.nextInt(colour.length);
            int rc3 = random.nextInt(colour.length);
            int rc4 = random.nextInt(colour.length);

            //System.out.println(colour[rc1]);
            //System.out.println(colour[rc2]);
            //System.out.println(colour[rc3]);
            //System.out.println(colour[rc4]);

            String randomColour1 = colour[rc1];
            String randomColour2 = colour[rc2];
            String randomColour3 = colour[rc3];
            String randomColour4 = colour[rc4];
            System.out.println("Die verfügenbaren Farben Blau, Rot, Grün, Gelb, Violet, Schwarz, Weiss, Grau");
            int num = 0;
            for (int i = 12; i > num; i--) {

                System.out.println("Sie haben noch " + i + " Versuche");



                scanner();
                i = Abgleichung(randomColour1, randomColour2, randomColour3, randomColour4, colour1, colour2, colour3, colour4, i);
                if (i == 1) {
                    System.out.println("Verloren, Sie haben alle Ihre Versuche aufgebraucht!");
                    System.out.println("Der Farbcode war:");
                    System.out.println(randomColour1);
                    System.out.println(randomColour2);
                    System.out.println(randomColour3);
                    System.out.println(randomColour4);
                }

            }


        } while (ende());
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
    public static int Abgleichung(String randomColour1, String randomColour2, String randomColour3, String randomColour4, String colour1, String colour2, String colour3, String colour4, int i) { //scanner einfügen
        int korrekt = 0;
        int vollKorrekt = 0;


        if (colour1.equalsIgnoreCase(randomColour1) || colour1.equalsIgnoreCase(randomColour2) || colour1.equalsIgnoreCase(randomColour3) || colour1.equalsIgnoreCase(randomColour4)) {
            korrekt++;
        }
        if (colour2.equalsIgnoreCase(randomColour1) || colour2.equalsIgnoreCase(randomColour2) || colour2.equalsIgnoreCase(randomColour3) || colour2.equalsIgnoreCase(randomColour4)) {
            korrekt++;
        }
        if (colour3.equalsIgnoreCase(randomColour1) || colour3.equalsIgnoreCase(randomColour2) || colour3.equalsIgnoreCase(randomColour3) || colour3.equalsIgnoreCase(randomColour4)) {
            korrekt++;
        }
        if (colour4.equalsIgnoreCase(randomColour1) || colour4.equalsIgnoreCase(randomColour2) || colour4.equalsIgnoreCase(randomColour3) || colour4.equalsIgnoreCase(randomColour4)) {
            korrekt++;
        }
        if (colour1.equalsIgnoreCase(randomColour1)) {
            vollKorrekt++;
        }
        if (colour2.equalsIgnoreCase(randomColour2)) {
            vollKorrekt++;
        }
        if (colour3.equalsIgnoreCase(randomColour3)) {
            vollKorrekt++;
        }
        if (colour4.equalsIgnoreCase(randomColour4)) {
            vollKorrekt++;
        }

        if (vollKorrekt == 4) {
            System.out.println("Gratulation, Sie haben gewonnen und haben " + (13-i) + " Versuche gebraucht.");
            i = 0;

        } else {
            System.out.println("Sie haben " + korrekt + " Farben korrekt.");
            System.out.println("Sie haben " + vollKorrekt + " Farben korrekt und an richtiger Stelle.");
        }

        return i;
    }
    public static Boolean ende() {
        Boolean restart;
        System.out.println("Möchtest du nochmals spielen? (Ja, Nein)");
        Scanner scanner = new Scanner(System.in);
        String rs = scanner.next();
        if (rs.equalsIgnoreCase("Ja")) {
            restart = true;
        } else {
            restart = false;
        }
         return restart;
    }
}
