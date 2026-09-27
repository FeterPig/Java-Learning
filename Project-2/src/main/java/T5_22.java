import java.util.Scanner;

public class T5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualRate = input.nextDouble();
        int totalMonths = years * 12;
        double monthlyRate = annualRate / 100 / 12;
        double monthlyPayment = loanAmount * monthlyRate / (1 - Math.pow(1 + monthlyRate, -totalMonths));
        double totalPayment = monthlyPayment * totalMonths;

        System.out.printf("\nMonthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n\n", totalPayment);
        System.out.printf("%-10s %-12s %-12s %s\n", "Payment#", "Interest", "Principal", "Balance");

        double balance = loanAmount;
        for (int i = 1; i <= totalMonths; i++) {
            double interest = monthlyRate * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-10d %-12.2f %-12.2f %.2f\n", i, interest, principal, balance);
        }
    }
}
