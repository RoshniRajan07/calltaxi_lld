package com.kce.bean;

public class Bookingtaxi {
	 public int bookingId;
	    public int customerId;
	    public char from;
	    public char to;
	    public int pickupTime;
	    public int dropTime;
	    public int amount;
	    public int taxiId;
		public int getBookingId() {
			return bookingId;
		}
		public void setBookingId(int bookingId) {
			this.bookingId = bookingId;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public char getFrom() {
			return from;
		}
		public void setFrom(char from) {
			this.from = from;
		}
		public char getTo() {
			return to;
		}
		public void setTo(char to) {
			this.to = to;
		}
		public int getPickupTime() {
			return pickupTime;
		}
		public void setPickupTime(int pickupTime) {
			this.pickupTime = pickupTime;
		}
		public int getDropTime() {
			return dropTime;
		}
		public void setDropTime(int dropTime) {
			this.dropTime = dropTime;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public int getTaxiId() {
			return taxiId;
		}
		public void setTaxiId(int taxiId) {
			this.taxiId = taxiId;
		}
}
