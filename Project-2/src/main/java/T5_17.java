import java.util.Scanner;

public class T5_17 {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i + 1; j > 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < i + 2; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
