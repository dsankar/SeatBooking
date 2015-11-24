package com.dsankar.seatbooking;

import com.google.common.base.Optional;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.MediaType;

import java.util.concurrent.atomic.AtomicLong;

@Path("/seatbooking")
@Produces(MediaType.APPLICATION_JSON)
public class SeatBookingResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public SeatBookingResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    @Path("/seatsavailable")
    public int numSeatsAvailable(@QueryParam("principle") Optional<Integer> venueLevel) {
        return new SeatBooking().numSeatsAvailable(venueLevel);
    }
    
    @GET
    @Timed
    @Path("/reserveseats")
    public String reserveSeats(@QueryParam("seatHoldId") int seatHoldId, @QueryParam("customerEmail") String customerEmail) {
        return new SeatBooking().reserveSeats(seatHoldId, customerEmail);
    }
    
    @GET
    @Timed
    @Path("/findAndHoldSeats")
    public String findAndHoldSeats(@QueryParam("numSeats") int numSeats, 
    		@QueryParam("minLevel") Optional<Integer> minLevel, 
    		@QueryParam("maxLevel") Optional<Integer> maxLevel, 
    		@QueryParam("customerEmail") String customerEmail) {
    	SeatHold sh = new SeatBooking().findAndHoldSeats(numSeats, minLevel, maxLevel, customerEmail);
        return sh.toString();
    }
    
}