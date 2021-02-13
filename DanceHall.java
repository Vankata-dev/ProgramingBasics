import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lRoom = Integer.parseInt(scanner.nextLine());
        int wRoom = Integer.parseInt(scanner.nextLine());
        int aWardrobe = Integer.parseInt(scanner.nextLine());

        int areaRoom = (lRoom * 100) * (wRoom * 100);
        int areaWardrobe = (aWardrobe * aWardrobe) * 100;
        int bench = areaRoom / 10;
        int freeSpace = areaRoom - areaWardrobe - bench;
        double dancers = Math.floor(freeSpace / (40 + 7000));


        System.out.println(dancers);


    }
}
