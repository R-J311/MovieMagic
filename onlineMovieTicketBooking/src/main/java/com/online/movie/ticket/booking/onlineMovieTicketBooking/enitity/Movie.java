package com.online.movie.ticket.booking.onlineMovieTicketBooking.enitity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private String language;

    @Column(nullable = false)
    private int duration; //in minutes

    @Column(nullable = false)
    private String rating;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String posterUrl; //url for movie poster


}
