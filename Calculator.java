import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.print("Введите символ либо 'exit' чтобы выйти: ");
            String symbol = scanner.nextLine();
            if (symbol.equals("exit")) {
                System.out.println("Хорошего дня");
                break;
            }else if (!symbol.equals("+") && !symbol.equals("-") && !symbol.equals("*") && !symbol.equals("/")) {
                System.out.println("Поддерживаются только данные символы '+', '-', '*', '/' !");
                continue;
            }
            try{
                System.out.print("Первое число: ");
                int a = Integer.parseInt(scanner.nextLine());

                System.out.print("Второе число: ");
                int b = Integer.parseInt(scanner.nextLine());

                switch (symbol){

                    case "+":
                        System.out.println("Ответ : "+ (a + b));
                        break;

                    case "-":
                        System.out.println("Ответ : "+ (a - b));
                        break;

                    case "*":
                        System.out.println("Ответ : "+ (a * b));
                        break;

                    case "/":
                        if (b != 0){
                            System.out.println("Ответ : "+ (a / b));
                        } else {
                            System.out.println(" Ошибка : гандон онени ами на ноль не делится пидораз !");
                        }
                        break;
                    default:
                        System.out.println("Неподдерживаемая операция");
                        break;
                }

            }catch (NumberFormatException e){
                System.out.println("Ошибка: введите корректное число.");


            }
        }
        scanner.close();
    }
}
