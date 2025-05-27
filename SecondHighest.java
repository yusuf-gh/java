// Вывод второго по величине числа в массиве

import java.util.*;
public class SecondHighest {
    public static void main(String[] args){
        int[] arr = {10, 5, 8, 20, 20, 15};

        int[] unique = Arrays.stream(arr).distinct().toArray();

        if (unique.length < 2){
            System.out.println("There is no second highest number");
        } else {
            Arrays.sort(unique);
            System.out.println("Second highest number is " + unique[unique.length - 2]);
        }
    }
}
