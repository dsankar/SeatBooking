package com.dsankar.seatbooking;

import com.google.common.base.Optional;

public class SeatBooking implements TicketService {

	@Override
	public int numSeatsAvailable(Optional<Integer> venueLevel) {
		return 6;
	}

	@Override
	public SeatHold findAndHoldSeats(int numSeats, Optional<Integer> minLevel,
			Optional<Integer> maxLevel, String customerEmail) {		
		return new SeatHold(1,"abc");
	}

	@Override
	public String reserveSeats(int seatHoldId, String customerEmail) {
		return "Reserve Seats";
	}

}
