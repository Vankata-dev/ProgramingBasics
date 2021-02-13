package Verifications;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzelCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = (puzzelCount * 2.60) + (dollsCount * 3) + (bearsCount * 4.10) + (minionsCount  * 8.20) + (trucksCount  * 2);
        int totalCount  =  puzzelCount + dollsCount + bearsCount + minionsCount  + trucksCount;
        if (totalCount >= 50) {
            totalPrice  = totalPrice - 0.25 * totalPrice;
        }

        double rent = 0.10 * totalPrice;
        totalPrice = tripPrice - rent;

        if (totalPrice >= tripPrice) {
            double leftSum = totalPrice - tripPrice;
            System.out.printf("Yes! %.2f lv left.", leftSum);
        }else {
            double needMoney = tripPrice - totalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", needMoney);
        }
    }
}

