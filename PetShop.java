import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Храна -> 2.50
        //Друга -> 4

        double dogFood = 2.50;
        int other = 4;
        double totalDogFoo = Double.parseDouble(scanner.nextLine()) * dogFood;
        int totalOther = Integer.parseInt(scanner.nextLine()) * other;
        double total = totalDogFoo + totalOther;

        System.out.printf("%.2f lv.", total);
    }
}
