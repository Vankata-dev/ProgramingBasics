import java.util.Scanner;

public class VegetableMarcet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double priceForKgVeg = Double.parseDouble(scanner.nextLine());
        Double priceForKgFruit = Double.parseDouble(scanner.nextLine());
        Double kgVeg = Double.parseDouble(scanner.nextLine());
        Double kgFruit = Double.parseDouble(scanner.nextLine());
        Double euro = 1.94;

        Double Veg = (priceForKgVeg*kgVeg)/euro;
        Double Fruit = (priceForKgFruit*kgFruit)/euro;
        Double wholeAmount = Veg + Fruit;

        System.out.printf("%.2f", wholeAmount);

    }
}
