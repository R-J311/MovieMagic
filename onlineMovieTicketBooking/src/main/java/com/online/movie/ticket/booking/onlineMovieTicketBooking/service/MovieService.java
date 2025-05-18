package com.online.movie.ticket.booking.onlineMovieTicketBooking.service;

import com.online.movie.ticket.booking.onlineMovieTicketBooking.UserDTO.MovieDTO;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.enitity.Movie;

import java.util.List;

public interface MovieService {
    Movie addMovie(MovieDTO movieDTO);

    Movie getMovieById(Long id);

    List<Movie>getAllMovies();

    Movie updateMovie(Long id, MovieDTO movieDTO);

    void deleteMovie(Long id);
}
