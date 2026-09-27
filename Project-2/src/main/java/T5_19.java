public class T5_19 {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j < 7 - i; j++) {
                System.out.print("    ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%3d", (int) Math.pow(2, j));
                System.out.print(" ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%3d", (int) Math.pow(2, j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
