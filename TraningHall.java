import java.util.Scanner;

public class TraningHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lenghtOfHall = Double.parseDouble(scanner.nextLine());
        double wightOfHall = Double.parseDouble(scanner.nextLine());
        double sideWardraw = Double.parseDouble(scanner.nextLine());

        double areaOfHall = (lenghtOfHall * 100) * (wightOfHall * 100);
        double areaOfWardrobe = (sideWardraw * 100) * (sideWardraw * 100);
        double areaOfBencch = areaOfHall * 0.1;
        double areaDancer = 7040;
        double freeSpace = areaOfHall - areaOfWardrobe - areaOfBencch;
        double countOfDancers = Math.floor(freeSpace / areaDancer);

        System.out.printf("%.0f", countOfDancers);
    }
}
