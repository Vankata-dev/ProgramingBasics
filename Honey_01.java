package com.company;

import java.util.Scanner;

public class Honey_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bees = Integer.parseInt(scanner.nextLine());
        int flowers = Integer.parseInt(scanner.nextLine());

        double honey = bees * flowers * 0.21;
        double honeComs = Math.floor(honey / 100);
        double honeyLeft = honey % 100;

        System.out.printf("%.0f honeycombs filled.%n", honeComs);
        System.out.printf("%.2f grams of honey left.", honeyLeft);
    }
}

