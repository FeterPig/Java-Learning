import java.util.Scanner;

public class T7_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[10];

        System.out.print("输入10个数字: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("排序后的数组: ");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}
