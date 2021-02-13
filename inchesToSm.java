import java.util.Scanner;

public class inchesToSm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sm = Double.parseDouble (scanner.nextLine());
        double inches = 2.54;
        double sum = sm * inches;

        System.out.println(sum);
    }
}
