import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String greeting = scan.nextLine();
        System.out.println("Hi " + greeting + "!");

        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        System.out.println("Huh, " + age + ", not bad!)");


    }
}
