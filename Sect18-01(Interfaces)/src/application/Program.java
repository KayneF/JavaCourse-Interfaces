package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data: ");
		System.out.print("Car model: ");
		String carModel = scan.nextLine();
		System.out.print("Rental date (dd/MM/yyyy HH:mm): ");
		LocalDateTime rentalDate = LocalDateTime.parse(scan.nextLine(), fmt);
		System.out.print("Return date (dd/MM/yyyy HH:mm): ");
		LocalDateTime returnDate = LocalDateTime.parse(scan.nextLine(), fmt);
		
		CarRental cr = new CarRental(
				rentalDate, 
				returnDate, 
				new Vehicle(carModel)
				);
		
		System.out.print("Enter the rental price per hour: ");
		double pricePerHour = scan.nextDouble();
		System.out.print("Enter the rental price per day: ");
		double pricePerDay = scan.nextDouble();
		
		RentalService rentalService = new RentalService(
				pricePerDay, 
				pricePerHour, 
				new BrazilTaxService()
				);
		
		rentalService.processInvoice(cr);
		
		System.out.println("\nINVOICE: ");
		System.out.println(
				"Basic payment: " 
				+ String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " 
				+ String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println(
				"Total payment: " 
				+ String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		scan.close();
	}

}
