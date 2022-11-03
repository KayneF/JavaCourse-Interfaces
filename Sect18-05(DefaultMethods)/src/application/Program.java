package application;

import java.util.Locale;
import java.util.Scanner;

import services.InterestService;
import services.USInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = scan.nextDouble();
		System.out.print("Months: ");
		int months = scan.nextInt();
		
		InterestService is = new USInterestService(1.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months: ");
		System.out.print(String.format("%.2f", payment));
		
		scan.close();
	}
}
