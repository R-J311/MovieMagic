package com.online.movie.ticket.booking.onlineMovieTicketBooking.service;

import com.online.movie.ticket.booking.onlineMovieTicketBooking.UserDTO.UserDTO;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.cusomexceptions.EmailAlreadyExistsException;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.cusomexceptions.UserNotFoundException;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.enitity.Role;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.enitity.User;
import com.online.movie.ticket.booking.onlineMovieTicketBooking.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public User registerUser(UserDTO userDTO) {
        if(userRepository.findByEmail(userDTO.getEmail())!=null){
            throw new EmailAlreadyExistsException("Email alredy exits: "+ userDTO.getEmail());
        }
        User user = modelMapper.map(userDTO, User.class);
        user.setRole(userDTO.getRole()!=null ? userDTO.getRole() : Role.CUSTOMER);
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException("User Not found with Given Id:" +id));
    }
}
