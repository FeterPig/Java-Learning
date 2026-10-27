import java.util.Scanner;

public class T7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] distinct = new int[10];
        int count = 0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            boolean isExist = false;

            for (int j = 0; j < count; j++) {
                if (distinct[j] == num) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                distinct[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinct[i] + " ");
        }
    }
}
