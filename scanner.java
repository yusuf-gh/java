import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");
        second(name);

    }
    public static void second(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вашу фамилию: ");
        String surname = scanner.nextLine();

        System.out.print("Здравствуйте, " + name + " " + surname + "!");

    }
}
