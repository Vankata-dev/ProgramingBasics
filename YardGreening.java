import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 m2 = 7.61
        //Отстъпка -> 18% = 18/100
        //Крайна стойност -> 7.61 - 18/100

        double main = 7.61;
        double discount = 0.18;
        double meters = Double.parseDouble(scanner.nextLine());


        double price = meters * main;
        double discountPrice = discount * price;
        double finalPrice = price - discountPrice;

        System.out.printf ("The final price is: %.2f lv.", finalPrice);
        System.out.printf("%n");
        System.out.printf ("The discount is: %.2f lv.", discountPrice);





    }
}
