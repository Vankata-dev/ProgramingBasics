import java.util.Scanner;

public class CharityCampayn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int numberOfBakers = Integer.parseInt(scanner.nextLine());
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        int numberOfGufret = Integer.parseInt(scanner.nextLine());
        int numberOfPancakes = Integer.parseInt(scanner.nextLine());
        int singleCake = 45;
        double singleGufret = 5.80;
        double singlePancake = 3.20;

        double cakes = (numberOfCakes * singleCake) / (1/8);
        double gufrets = (numberOfGufret * singleGufret)/ (1/8);
        double pancakes = (numberOfPancakes * singlePancake) / (1/8);

        double amountPerDay = (cakes + gufrets +pancakes) * numberOfBakers;
        double hallAmount = amountPerDay * days;
        double deductedAmount = hallAmount;

        System.out.printf("%.2f", deductedAmount);




    }
}
