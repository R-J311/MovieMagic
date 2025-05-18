package com.online.movie.ticket.booking.onlineMovieTicketBooking.cusomexceptions;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException(String message){
        super(message);
    }
}
