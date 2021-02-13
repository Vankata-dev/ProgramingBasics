package Verifications;

import java.util.Scanner;

public class GraterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int nimber2 = Integer.parseInt(scanner.nextLine());

        if (number1 > nimber2){
            System.out.println(number1);
        }else {
            System.out.println(nimber2);
        }
    }
}
