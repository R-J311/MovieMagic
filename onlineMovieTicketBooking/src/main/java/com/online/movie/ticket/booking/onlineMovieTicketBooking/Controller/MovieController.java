package com.online.movie.ticket.booking.onlineMovieTicketBooking.Controller;

import com.online.movie.ticket.booking.onlineMovieTicketBooking.UserDTO.MovieDTO;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.enitity.Movie;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/addMovie")
    public ResponseEntity<Movie>addMovie(@RequestBody MovieDTO movieDTO){
        Movie createMovie= movieService.addMovie(movieDTO);
        return ResponseEntity.ok(createMovie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie>getMovieById(@PathVariable Long id){
        Movie movie = movieService.getMovieById(id);
        return  ResponseEntity.ok(movie);
    }

    @GetMapping
    public ResponseEntity<List<Movie>>getAllMovies(){
        List<Movie> movies= movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie>updateMovie(@PathVariable Long id, @RequestBody MovieDTO movieDTO){
        Movie updatedMovie = movieService.updateMovie(id, movieDTO);
        return ResponseEntity.ok(updatedMovie);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Movie>deleteMovie(@PathVariable Long id){
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }
}
