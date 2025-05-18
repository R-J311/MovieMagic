package com.online.movie.ticket.booking.onlineMovieTicketBooking.service;

import com.online.movie.ticket.booking.onlineMovieTicketBooking.UserDTO.UserDTO;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.enitity.User;


public interface UserService {
    User registerUser (UserDTO userDTO);
    User getUserById(Long id);
}
