# SeatBooking
Seat Booking of seats within a high-demand performance venue.    
Make sure you have gradle in path    

        gradle capsule  
        
        java -jar build/libs/seatbooking.jar server build/resources/seatbooking.yml   
        
        
        http://localhost:9000/seatbooking/seatsavailable  
        
        http://localhost:9000/seatbooking/reserveseats?seatHoldId=1&amp;customerEmail=anc  
        
        http://localhost:9000/seatbooking/findAndHoldSeats?seatHoldId=1&amp;minLevel=2&amp;maxLevel=3&amp;customerEmail=anc   
        
        http://localhost:9000/seatbooking/seatsavailable?principle=1  
        
        http://localhost:9000/seatbooking/findAndHoldSeats?seatHoldId=1&amp;customerEmail=anc
