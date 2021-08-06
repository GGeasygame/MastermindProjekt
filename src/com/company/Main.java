package com.company;

import java.util.Random;

import java.util.Scanner;

public class Main {
    public static String colour1;
    public static String colour2;
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

        scanner();
        Abgleichung(randomColour1, randomColour2, randomColour3, randomColour4, colour1, colour2);
    }

    public static String scanner() {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Geben Sie Ihre erste Farbe ein");
        colour1 = scanner1.next();

        System.out.println("Geben Sie Ihre zweite Farbe ein");
        colour2 = scanner1.next();


    }

    public static void Abgleichung(String randomColour1, String randomColour2, String randomColour3, String randomColour4, String colour1, String colour2) { //scanner einfügen
        if (colour1 == randomColour1) {

        }
    }
