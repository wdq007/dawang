import com.dawang.introjava.comprehensive.fx.Loan;
import com.dawang.introjava.comprehensive.fx.Loan;

import java.util.Scanner;

public class TestLoan {

    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer:");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan mount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The load was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(),
                loan.getMonthlyPayment(),
                loan.getTotalPayment());
    }
}
