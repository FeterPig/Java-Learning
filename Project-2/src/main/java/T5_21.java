import java.util.Scanner;

public class T5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        int totalMonths = years * 12;

        System.out.printf("%-15s %-18s %s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        for (double annualRate = 5.0; annualRate <= 8.0; annualRate += 0.125) {
            double monthlyRate = annualRate / 100 / 12;
            double monthlyPayment = loanAmount * monthlyRate / (1 - Math.pow(1 + monthlyRate, -totalMonths));
            double totalPayment = monthlyPayment * totalMonths;
            String rate = String.format("%.3f%%", annualRate);
            System.out.printf("%-16s%-19.2f%.2f\n", rate, monthlyPayment, totalPayment);
        }
    }
}
