package Verifications;

import java.util.Scanner;

public class ToyShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holidayCost = Double.parseDouble(scanner.nextLine());
        int puzzels = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());


        double puzzelsPrice = 2.60;
        int talkingDollsPrice = 3;
        double teddyBearsPrice = 4.10;
        double minionsPrice = 8.20;
        int truckPrice = 2;

        double toysCost = puzzels * puzzelsPrice
                + talkingDolls * talkingDollsPrice
                + teddyBears * teddyBearsPrice
                + minions * minionsPrice
                + trucks * truckPrice;

        double toysQty = puzzels + talkingDolls + teddyBears + minions + trucks;
        if (toysQty >= 50) {
            toysCost = toysCost - 0.25 * toysCost;

        }
        double rent = 0.1 * toysCost;
        double profit = toysCost - rent;
        double leftProfit = profit - holidayCost;
        if (leftProfit >= 0) {
            System.out.printf("Yes! %.2f lv left.", leftProfit);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.");
        }


    }
}

