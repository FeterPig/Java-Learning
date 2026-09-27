import java.util.Scanner;

public class T5_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("输入年份: ");
        int year = input.nextInt();
        System.out.print("输入代表该年第一天是星期几的数字: ");
        int startDay = input.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) daysInMonth[1] = 29;

        for (int m = 0; m < 12; m++) {
            System.out.printf("\n%15s %d\n", monthNames[m], year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }

            int day;
            for (day = 1; day <= daysInMonth[m]; day++) {
                System.out.printf("%3d ", day);
                if ((day + startDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
            startDay = (startDay + daysInMonth[m]) % 7;
        }
    }
}
