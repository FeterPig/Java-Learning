import java.util.Scanner;

public class T5_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("输入十进制: ");
        int num = input.nextInt();
        String octal = "";

        while (num > 0) {
            int rem = num % 8;
            octal = rem + octal;
            num /= 8;
        }
        System.out.println("转为八进制: " + octal);
    }
}
