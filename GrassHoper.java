public class GrassHoper {
    public static char getGrade(int s1, int s2, int s3) {
        int avg = (s1 + s2 + s3) / 3;
        // if (avg >= 90){
        //     return 'A';
        // } else if (avg >= 80 && 90 > avg){
        //     return 'B';
        // } else if (avg >= 70 && 80 > avg){
        //     return 'C';
        // } else if (avg >= 60 && 70 > avg){
        //     return 'D';
        // } else {
        //     return 'F';
        // }
        return (avg >= 90) ? 'A' :
                (avg >= 80) ? 'B' :
                (avg >= 70) ? 'C' :
                (avg >= 60) ? 'D' : 'F';
    }
}
