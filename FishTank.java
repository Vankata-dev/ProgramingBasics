import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = (Double.parseDouble(scanner.nextLine())) * 0.01;

        double liter = 0.001;

        int volume = length * width * height;
        double litters = volume * liter;
        double realLitters = litters * (1 - percent);

        System.out.printf("%.3f", realLitters);

    }
}
