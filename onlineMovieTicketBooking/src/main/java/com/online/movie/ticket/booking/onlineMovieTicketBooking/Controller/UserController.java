package com.online.movie.ticket.booking.onlineMovieTicketBooking.Controller;

import com.online.movie.ticket.booking.onlineMovieTicketBooking.UserDTO.UserDTO;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.enitity.User;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //Register user
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserDTO userDTO){
     User createUser =  userService.registerUser(userDTO);
     return ResponseEntity.ok(createUser);
    }

    //get user by id
    @GetMapping("/{id}")
    public ResponseEntity<User>getUserById(@PathVariable Long id){
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }



}
