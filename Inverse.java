public class Inverse {
    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++){
            result[i] = -array[i];
        }
        return result;

    }
}
