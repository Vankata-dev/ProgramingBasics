import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double C = Double.parseDouble(scanner.nextLine());
        Double F = (C*9/5)+32;
        System.out.printf("%.2f", F);

    }
}
