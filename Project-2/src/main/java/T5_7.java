public class T5_7 {
    public static void main(String[] args) {
        int tuition = 10000;
        double rate = 1.05;

        // 十年后的学费
        double tuitionTenYears = tuition;
        for (int i = 0; i < 10; i++) {
            tuitionTenYears *= rate;
        }
        System.out.println("十年后的学费：" + tuitionTenYears + "美元");

        // 后四年总学费
        double total = tuitionTenYears;
        for (int i = 0; i < 3; i++) {
            tuitionTenYears *= rate;
            total += tuitionTenYears;
        }
        System.out.println("十年后四年总学费：" + total + "美元");
    }
}
