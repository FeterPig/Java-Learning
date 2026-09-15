public class ShowLogicErrors {
    public static void main(String[] args) {
        // 逻辑错误：应使用浮点数除法
        System.out.print("Celsius 35 is Fahrenheit degree ");
        System.out.println((9 / 5) * 35 + 32);
    }
}
