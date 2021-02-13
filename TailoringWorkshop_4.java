import java.util.Scanner;

public class TailoringWorkshop_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTables = Integer.parseInt(scanner.nextLine());
        double lengthOfTables = Double.parseDouble(scanner.nextLine());
        double wightOfTables = Double.parseDouble(scanner.nextLine());

        double areaTableCloth = countTables * (lengthOfTables + 2 * 0.30) * (wightOfTables + 2 * 0.30);
        double tableCover = countTables * (lengthOfTables / 2) * (lengthOfTables/ 2);

        double priceDollars = areaTableCloth * 7 + tableCover * 9;
        double priceLeva = priceDollars * 1.85;

        System.out.printf("%.2f USD", priceDollars);
        System.out.printf("%n");
        System.out.printf("%.2f BGN", priceLeva);

    }
}
