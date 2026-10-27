import java.util.Random;

public class T9_4 {
    public static void main(String[] args) {
        Random random = new Random(1000);

        System.out.println("The first 50 random integers are:");
        for (int i = 0; i < 50; i++) {
            System.out.print(random.nextInt(100) + " ");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
