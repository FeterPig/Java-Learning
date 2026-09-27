import java.util.Scanner;

public class T5_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int num = input.nextInt();
        int[] digits = new int[9];
        int sum = 0;
        for (int i = 8; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        for (int i = 0; i < 9; i++) {
            sum += digits[i] * (i + 1);
        }

        int check = sum % 11;
        System.out.print("The ISBN-10 number is ");
        for (int i = 0; i < 9; i++) {
            System.out.print(digits[i]);
        }
        if (check == 10) {
            System.out.println("X");
        } else {
            System.out.println(check);
        }
    }
}
