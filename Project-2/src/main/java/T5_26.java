public class T5_26 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double e = 1.0;
            double item = 1.0;
            for (int k = 1; k <= i; k++) {
                item = item / k;
                e = e + item;
            }
            System.out.printf("i = %d, e = %f\n", i, e);
        }
    }
}
