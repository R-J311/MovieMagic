package com.online.movie.ticket.booking.onlineMovieTicketBooking.service;

import com.online.movie.ticket.booking.onlineMovieTicketBooking.UserDTO.MovieDTO;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.cusomexceptions.UserNotFoundException;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.enitity.Movie;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.repository.MovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl  implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Movie addMovie(MovieDTO movieDTO) {
        Movie movie = modelMapper.map(movieDTO, Movie.class);
        return movieRepository.save(movie);
    }

    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Movie not Found with ID :" + id));
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie updateMovie(Long id, MovieDTO movieDTO) {
        Movie existingMovie = getMovieById(id);
        modelMapper.map(movieDTO, existingMovie); //Update fields
        return movieRepository.save(existingMovie);
    }

    @Override
    public void deleteMovie(Long id) {
        if(!movieRepository.existsById(id)){
            throw new UserNotFoundException("Movie not found with ID : "+ id);
        }
        movieRepository.deleteById(id);

    }
}
