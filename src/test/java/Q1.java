public class Q1 {
    public static void main(String[] args) {
        int [] temp = {12, 42, 105, 31, 21, 11, 52};

        int max = temp[0];
        int min = temp[0];

        for (int t : temp) {

            if (t > max) {
                max = t;
            }
            if (t < min) {
                min = t;
            }
        }
        System.out.println("max temp " + max);
        System.out.println("min temp " + min);
    }
}
