
//public class Main {
//    public static void main(String[] args) {
//        // 1. Простой вывод строки
//        System.out.println("Hello, World!");
//
//        // 2. Вывод чисел
//        int number = 42;
//        System.out.println("Число: " + number);
//
//        // 3. Вывод нескольких значений
//        String name = "John";
//        int age = 25;
//        System.out.println("Имя: " + name + ", Возраст: " + age);
//
//        // 4. Форматированный вывод
//        System.out.printf("Форматированный вывод: Имя: %s, Возраст: %d%n", name, age);
//
//        // 5. Вывод без перехода на новую строку
//        System.out.print("Это первая часть ");
//        System.out.print("будет в той же строке");
//        System.out.println(); // переход на новую строку
//
//        // 6. Вывод с табуляцией и новыми строками
//        System.out.println("Строка 1\nСтрока 2\tПосле табуляции");
//
//        // 7. Вывод чисел с плавающей точкой
//        double pi = 3.14159;
//        System.out.printf("Число π ≈ %.2f%n", pi); // выведет 2 знака после запятой
//    }
//}


public class Main {
    public static void main (String[] args){
        int number = 1, number2 = 2;
        System.out.println(number + number2);

        var NoName = 10;
        System.out.println(NoName);

        final int finalNumber = 10;
        System.out.println(finalNumber);

        boolean isActive = false;
        boolean isAdmin = true;
        System.out.println(isActive);
        System.out.println(isAdmin);

        byte a = 127;
        byte b = -128;
        System.out.println(a + b);

        short c = 3;
        short d = 8;
        System.out.println(c + d);

        long e = 5;
        long f = 10;
        System.out.println(e + f);

        float x = 8.5F;
        float y = 2.7F;
        System.out.println(x + y);

        char ch=102;
        System.out.println(ch);

        String hello = "\nHello...";
        System.out.println(hello);

        String text = """
                
                Вот мысль, которой весь я предан,
                Итог всего, что ум скопил.
                Лишь тот, кем бой за жизнь изведан,
                Жизнь и свободу заслужил.
                """;
        System.out.println(text);
        System.out.println(text.length());

        System.out.printf("x=%d; y=%d \n", e, f);

        System.out.print("\nHello, World!");
        System.out.println("hi");
        System.out.print("Hello, World!");

    }

}





