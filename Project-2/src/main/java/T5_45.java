import java.util.Scanner;

public class T5_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("输入10个数字: ");

        double sum = 0;
        double sumSquare = 0;
        int n = 10;

        for (int i = 0; i < n; i++) {
            double num = input.nextDouble();
            sum += num;
            sumSquare += num * num;
        }

        double mean = sum / n;
        double standard = Math.sqrt((sumSquare - sum * sum / n) / (n - 1));

        System.out.println("平均值是: " + mean);
        System.out.println("标准差是: " + standard);
    }
}
