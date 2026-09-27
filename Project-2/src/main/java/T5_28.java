import java.util.Scanner;

public class T5_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] weekNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("输入年份: ");
        int year = input.nextInt();
        System.out.print("输入代表该年第一天是星期几的数字: ");
        int dayOfWeek = input.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) daysInMonth[1] = 29;

        for (int m = 0; m < 12; m++) {
            System.out.printf("%s 1, %d is %s%n", monthNames[m], year, weekNames[dayOfWeek]);
            dayOfWeek = (dayOfWeek + daysInMonth[m]) % 7;
        }
    }
}
