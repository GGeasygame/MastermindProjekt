package com.company;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do {
            //colour generator
            String[] colour = {"BLAU", "ROT", "GRÜN", "GELB", "VIOLET", "SCHWARZ", "WEISS", "GRAU"};
            String[] colourNormal = {"Blau", "Rot", "Grün", "Gelb", "Violet", "Schwarz", "Weiss", "Grau"};
            Random random = new Random();
            int rc1 = random.nextInt(colourNormal.length);
            int rc2 = random.nextInt(colourNormal.length);
            int rc3 = random.nextInt(colourNormal.length);
            int rc4 = random.nextInt(colourNormal.length);

            String randomColour1 = colourNormal[rc1];
            String randomColour2 = colourNormal[rc2];
            String randomColour3 = colourNormal[rc3];
            String randomColour4 = colourNormal[rc4];
            String[] randomColours = {randomColour1, randomColour2, randomColour3, randomColour4};
            System.out.println("Die verfügenbaren Farben Blau, Rot, Grün, Gelb, Violet, Schwarz, Weiss, Grau");

            int num = 0;
            for (int o = 12; o > num; o--) {

                System.out.println("Sie haben noch " + o + " Versuche");


                String[] colours;
                colours = scanner(colour);
                o= checkTreffer(colours, randomColours, o);
                if (o == 1) {
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
    public static String[] scanner(String[] colour) {

        Scanner scanner1 = new Scanner(System.in);
        String[] colours = new String[4];
        System.out.println("Geben Sie Ihre erste Farbe ein:");
        colours[0] = rechtschreibung(0, colour);
        System.out.println("Geben Sie Ihre zweite Farbe ein:");
        colours[1] = rechtschreibung(1, colour);
		System.out.println("Geben Sie Ihre dritte Farbe ein:");
        colours[2] = rechtschreibung(2, colour);
		System.out.println("Geben Sie Ihre vierte Farbe ein:");
        colours[3] = rechtschreibung(3, colour);

		return colours;
    }
    public static String rechtschreibung(int number, String[] allColours) {
        Scanner scanner1 = new Scanner(System.in);
        String[] colours = new String[4];
        colours[number] = scanner1.next();
        while (!Arrays.asList(allColours).contains(colours[number].toUpperCase())) {
            System.out.println("Rechtschreibfehler! Bitte geben Sie die Farbe nochmals ein.");
            colours[number] = scanner1.next();
        }
    return colours[number];
    }
//Vergleich von gewählten Farben mit computergenerierten Farben
    public static int checkTreffer(String[] colours, String[] randomColours, int o) {


        int treffer[] = new int[4];
        int vollTreffer[] = new int[4];
        for(int a = 0;a<4;a++){
        treffer[a] = 0;
        vollTreffer[a] = 0;
        }


        for (int i = 0; i < 4; i++) {
            if (colours[i].equalsIgnoreCase(randomColours[i])) {
                vollTreffer[i] = 1;
            } else {
                for(int j = 0; j < 4; j++){
                    if(colours[j].equalsIgnoreCase(randomColours[i]) && !colours[j].equalsIgnoreCase(randomColours[j])){
                        treffer[j] = 1;
                    }
                }
            }
        }
        int zaehler = 0;
        for (int i = 0; i < treffer.length; i++ ) {
            zaehler += treffer[i];
        }
        int zaehler1 = 0;
        for (int i = 0; i < vollTreffer.length; i++ ) {
            zaehler1 += vollTreffer[i];
        }
        if (zaehler1 == 4) {
            System.out.println("Glückwunsch, Sie haben gewonnen. Sie haben  " + (13-o) + " Versuche gebraucht.");
            o = 0;
        }
        if (zaehler1 != 4) {
            System.out.println("Sie haben " + zaehler1 + " Farben korrekt und an der richtigen Stelle.");
            System.out.println("Sie haben " + zaehler + " Farben korrekt.");
        }
        return o;
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
