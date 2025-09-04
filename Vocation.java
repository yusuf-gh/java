public class Vocation {
    public static int rentalCarCost(int d) {
        // 1 = 40$
        // 7 = 230$ (50$ discount)
        // 3-6 = 100, 140, 180, 220 (20$ discount)
        return (d < 3) ? 40 * d :
                (d >= 3 && d < 7) ? 40 * d - 20 :
                (d >= 7) ? 40 * d - 50 : 0;
    }
}
