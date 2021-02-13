package com.company;

import java.util.Scanner;

public class HoneyHarvest_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double honey = 0;

        switch (flower){
            case "Sunflower":
                if ("Spring".equals(season)) {
                    honey = 10 * numberFlowers;
                } else if ("Summer".equals(season)) {
                    honey = (10 * numberFlowers) * 1.1;
                } else if ("Autumn".equals(season)) {
                    honey = (12 * numberFlowers) * 0.95;
                }
                break;
            case "Daisy":
                if ("Spring".equals(season)) {
                    honey = 12 * numberFlowers * 1.1;
                } else if ("Summer".equals(season)) {
                    honey = (8 * numberFlowers) * 1.1;
                } else if ("Autumn".equals(season)) {
                    honey = (6 * numberFlowers) * 0.95;
                }
                break;
            case "Lavender":
                if ("Spring".equals(season)) {
                    honey = 12 * numberFlowers;
                } else if ("Summer".equals(season)) {
                    honey = (8 * numberFlowers) * 1.1;
                } else if ("Autumn".equals(season)) {
                    honey = (6 * numberFlowers) * 0.95;
                }
                break;
            case "Mint":
                if ("Spring".equals(season)) {
                    honey = (10 * numberFlowers) * 1.1;
                } else if ("Summer".equals(season)) {
                    honey = (12 * numberFlowers) * 1.1;
                } else if ("Autumn".equals(season)) {
                    honey = (6 * numberFlowers) * 0.95;
                }
                break;
        }
        System.out.printf("Total honey harvested: %.2f", honey);
    }
}
