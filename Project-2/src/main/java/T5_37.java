import java.util.Scanner;

public class T5_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("输入十进制: ");
        int num = input.nextInt();
        String binary = "";

        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary;
            num /= 2;
        }
        System.out.println("转为二进制: " + binary);
    }
}
