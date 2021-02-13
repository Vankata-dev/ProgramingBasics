import java.util.Scanner;

public class projectHrs {
    public static void main(String[] args) {
        //Вход
        //Име
        //Проект -> 3часа
        //Брой проекти


        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int project = 3;
        int number = Integer.parseInt(scanner.nextLine());
        int projects = (project * number);

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, projects, number);

    }
}
