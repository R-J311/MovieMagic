package com.online.movie.ticket.booking.onlineMovieTicketBooking.UserDTO;

import com.online.movie.ticket.booking.onlineMovieTicketBooking.enitity.Role;
import lombok.*;

@Data
public class UserDTO {

    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private Role role;
}
