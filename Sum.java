public class Sum {
    public static int sum(int[] numbers)
    {
        if (numbers == null || numbers.length <= 2) return 0;
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i : numbers){
            sum += i;
            if (i < min) min = i;
            if (i > max) max = i;
        }

        return sum - min - max;

    }
}
