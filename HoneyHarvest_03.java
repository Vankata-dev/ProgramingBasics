package com.company;

import java.util.Scanner;

public class HoneyHarvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double honey = 0;

        switch (season) {
            case "Spring":
                switch (flower) {
                    case "Sunflower":
                        honey = 10 * numberFlowers;
                        break;
                    case "Daisy":
                        honey = (12 * numberFlowers) * 0.90;
                        break;
                    case "Lavender":
                        honey = 12 * numberFlowers;
                        break;
                    case "Mint":
                        honey = (10 * numberFlowers) * 0.90;
                        break;
                }
            case "Summer":
                switch (flower) {
                    case "Sunflower":
                        honey = (8 * numberFlowers) * 0.90;
                        break;
                    case "Daisy":
                        honey = (8 * numberFlowers) * 0.90;
                        break;
                    case "Lavender":
                        honey = (8 * numberFlowers) * 0.90;
                        break;
                    case "Mint":
                        honey = (12 * numberFlowers) * 0.90;
                        break;
                }
            case "Autum":
                switch (flower) {
                    case "Sunflower":
                        honey = (12 * numberFlowers) / 0.95;
                        break;
                    case "Daisy":
                        honey = (6 * numberFlowers) / 0.95;
                        break;
                    case "Lavender":
                        honey = (6 * numberFlowers) / 0.95;
                        break;
                    case "Mint":
                        honey = (6 * numberFlowers) / 0.95;
                        break;
                }
        }
        System.out.printf("Total honey harvested: %.2f", honey);
    }
}