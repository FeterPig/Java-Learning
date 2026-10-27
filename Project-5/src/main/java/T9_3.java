import java.util.Date;

public class T9_3 {
    public static void main(String[] args) {
        long[] elapsedTimes = {
                10000L, 100000L, 1000000L, 10000000L,
                100000000L, 1000000000L, 10000000000L, 100000000000L
        };
        Date date = new Date();

        for (long elapsedTime : elapsedTimes) {
            date.setTime(elapsedTime);
            System.out.println(elapsedTime + ": " + date.toString());
        }
    }
}
