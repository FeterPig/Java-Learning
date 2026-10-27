import java.util.GregorianCalendar;

public class T9_5 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Current date: " + year + "-" + month + "-" + day);

        calendar.setTimeInMillis(1234567898765L);

        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH) + 1;
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("The date of 1234567898765L milliseconds is " + year + "-" + month + "-" + day);
    }
}
