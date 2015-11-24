package com.dsankar.seatbooking;

public class SeatHold {
	
	int seatHoldId;
	String customerEmail;

	public SeatHold(int seatHoldId, String customerEmail) {
		super();
		this.seatHoldId = seatHoldId;
		this.customerEmail = customerEmail;
	}
	
	/**
	 * @return the customerEmail
	 */
	private String getCustomerEmail() {
		return customerEmail;
	}
	/**
	 * @param customerEmail the customerEmail to set
	 */
	private void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	/**
	 * @return the seatHoldId
	 */
	private int getSeatHoldId() {
		return seatHoldId;
	}
	/**
	 * @param seatHoldId the seatHoldId to set
	 */
	private void setSeatHoldId(int seatHoldId) {
		this.seatHoldId = seatHoldId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SeatHold [seatHoldId=" + seatHoldId + "]";
	}
	

}
