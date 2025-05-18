package com.online.movie.ticket.booking.onlineMovieTicketBooking.UserDTO;

import lombok.Data;

@Data
public class MovieDTO {
    private String title;
    private String genre;
    private String language;
    private int duration;
    private String rating;
    private String description;
    private String posterUrl;
}
