package com.online.movie.ticket.booking.onlineMovieTicketBooking.repository;

import com.online.movie.ticket.booking.onlineMovieTicketBooking.enitity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
