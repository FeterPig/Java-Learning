public class T5_25 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double sum = 0;
            for (int k = 1; k <= i; k++) {
                if (k % 2 == 1) {
                    sum += 1.0 / (2 * k - 1);
                } else {
                    sum -= 1.0 / (2 * k - 1);
                }
            }
            double pi = 4 * sum;
            System.out.printf("i = %d, pi = %f\n", i, pi);
        }
    }
}
