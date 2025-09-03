public class AverageScore {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
      int sum = 0;
      for (int i : classPoints){
        sum += i;
      }
      int average = sum / classPoints.length;
      return yourPoints > average;
  }
}
