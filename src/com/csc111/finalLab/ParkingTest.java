package com.csc111.finalLab;

import java.util.Scanner;

public class ParkingTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String option = null;
		ParkingInvoice v1 = null;
		int total = 0;
		System.out.println("Welcome to the Parking Invoice System");
		System.out.println("------------------------------");
		System.out.println("add ==> add a new invoice.");
		System.out.println("pay ==> pay current invoice.");
		System.out.println("print ==> print current invoice.");
		System.out.println("exit ==> terminate the program.");
		System.out.println("------------------------------");
		System.out.println("Type your command.");
		System.out.print(">: ");
		option = input.next();
//		do { 
	while(!option.equalsIgnoreCase("exit")) {			
			if(option.equalsIgnoreCase("add")) {
				System.out.println("Enter the type and duration: ");
				String type = input.next();
				int duration = input.nextInt();
				v1 = new ParkingInvoice(type, duration);
				System.out.print(">: ");
				option = input.next();
			} else if(option.equalsIgnoreCase("pay")) {
				if(v1 == null) {
					System.out.println("ERROR: no current invoice.");
					System.out.print(">: ");
					option = input.next();
				} else if(v1.getPaid()) {
					System.out.println("ERROR: already paid.");
					System.out.print(">: ");
					option = input.next();
				} else {
				v1.setPaid();
				System.out.println("Payment done.");
				total += v1.calcPrice();
				System.out.print(">: ");
				option = input.next();
				}
			} else if(option.equalsIgnoreCase("print")) {
				if(v1 == null) {
					System.out.println("ERROR: no current invoice.");
					System.out.print(">: ");
					option = input.next();
				} else {
				v1.print();
				System.out.print(">: ");
				option = input.next();
				}
			} else {
				System.out.println("ERROR: incorrect command.");
				System.out.print(">: ");
				option = input.next();
			}
	}
				
//		} while(!option.equalsIgnoreCase("exit"));
		System.out.println("Sum of paid invoices: " + total + " SR");
		System.out.println("Total invoices: " + ParkingInvoice.CountInvoices() + "\npaid invoices: " + ParkingInvoice.CountPaidInvoices());
		System.out.println("Goodbye.");
	}
}
