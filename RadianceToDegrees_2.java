import java.util.Scanner;

public class RadianceToDegrees_2 {
    public static void main(String[] args) {
        //1.Прочитаме радианите
        //2. degrees = radians * 180 / 3.1416
        //3 Принтираме закръгляме до най близкото
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.printf("%.0f", degrees);
    }
}
