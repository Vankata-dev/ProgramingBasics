import java.util.Scanner;

public class RectangleArea_3 {
    public static void main(String[] args) {
        //1. Вход
        //2. Lenght -> x1-x2
        //3. width -> y1-y2
        // Calculate peruneter -> 2*Lenght + 2*width

        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double lengh = Math.abs(x1 - x2);
        double wigth = Math.abs(y1 - y2);

        double area = lengh * wigth;
        double perimeter = 2 * (lengh + wigth);

        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", perimeter);


    }
}
