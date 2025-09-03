public class Positive {
    public static int sum(int[] arr){
        int result = 0;
        for (int i : arr){
            result += (i > 0) ? i : 0;
        }
        return result;
    }
}
