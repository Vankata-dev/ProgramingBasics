package com.company;

import java.util.Scanner;

public class BehaveRole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intelect = Integer.parseInt(scanner.nextLine());
        int strenght = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();

        if (intelect >= 80 && strenght >= 80 && gender.equals("female")){
            System.out.println("Queen Bee");
        }else if (intelect >= 80 && strenght < 80){
            System.out.println("Repairing Bee");
        }else if (intelect >= 60 && intelect < 80){
            System.out.println("Cleaning Bee");
        }else if (intelect < 60 && strenght >= 80 && gender.equals("male")){
            System.out.println("Drone Bee");
        }else if (intelect < 60 && strenght >=60 && strenght < 80){
            System.out.println("Guard Bee");
        }else {
            System.out.println("Worker Bee");
        }
    }
}
