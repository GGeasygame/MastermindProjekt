package com.company;

import java.util.Random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //colour generator
        String[] colour = {"Blue", "Red", "Green", "Yellow", "Purple", "Black", "White", "Grey"};
        Random random = new Random();
        int randomColour1 = random.nextInt(colour.length);
        int randomColour2 = random.nextInt(colour.length);
        int randomColour3 = random.nextInt(colour.length);
        int randomColour4 = random.nextInt(colour.length);

        System.out.println(colour[randomColour1]);
        System.out.println(colour[randomColour2]);
        System.out.println(colour[randomColour3]);
        System.out.println(colour[randomColour4]);

        scanner();
        Abgleichung(randomColour1, randomColour2, randomColour3, randomColour4);
    }

    public static String scanner() {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Geben Sie Ihre erste Farbe ein");
        String colour1 = scanner1.next();

        System.out.println("Geben Sie Ihre zweite Farbe ein");
        String colour2 = scanner1.next();


        return colour1 + colour2;
    }

    public static void Abgleichung(String randomColour1, String randomColour2, String randomColour3, String randomColour4) { //scanner einfügen
        if (scanner1 ==) {

        }
    }
