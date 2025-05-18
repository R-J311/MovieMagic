package com.online.movie.ticket.booking.onlineMovieTicketBooking.cusomexceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
        super(message);
    }
}
