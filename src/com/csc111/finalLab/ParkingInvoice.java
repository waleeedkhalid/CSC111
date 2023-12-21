package com.csc111.finalLab;

public class ParkingInvoice {
	private String type;
	private int duration;
	private boolean paid;
	private static int countInvoices;// i added it in 17 dec at 2:28 PM
	private static int countPaidInvoices;// i added it in 17 dec at 2:29 PM
	
	public static double CountInvoices() {
		return countInvoices;
	}
	
	public static double CountPaidInvoices() {
		return countPaidInvoices;
	}
	
	public ParkingInvoice() {
		type = "short";
		duration = 1;
		paid = false;
		countInvoices++;
	}
	
	public ParkingInvoice(String type, int duration) {
		this.type = type;
		this.duration = duration;
		paid = false;
		countInvoices++;
	}
	
	public void setType(String type) {
		if(type.equalsIgnoreCase("short") || type.equalsIgnoreCase("long")) {
			this.type = type;
		} else {
		this.type = "short";
		}
	}
	
	public void setDuration(int duration) {
		if(duration < 0) this.duration = 1;
		this.duration = duration;
	}
	
	public void setPaid() {
		this.paid = true;
		countPaidInvoices++;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public boolean getPaid() {
		return paid;
	}
	
	public int calcPrice() {
		int price = 0;
		if(this.type.equalsIgnoreCase("short")) {
			price = 10 * this.duration;
			return price;
		} else {
			price = 5 * this.duration;
			return price;
		}
	}
		
	public void print() {
		System.out.println("Invoice [type: "+this.type+", duration: " + this.duration + " hour(s), paid: " + (this.paid ? "yes" : "no")+", price: " + calcPrice() + " SR.]");
	}
}
