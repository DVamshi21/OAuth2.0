package org.vamshi.AuthorizationServerDumy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.vamshi.AuthorizationServerDumy.Repository.UserRepository;
import org.vamshi.AuthorizationServerDumy.entity.User;
@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    //@Autowired
   // private final UserRepository _userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Here you would fetch the user from the database using the username
        // For demonstration, we are creating a dummy user
       User user = UserRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
         user.getPassword(), List.of(new SimpleGrantedAuthority(user.getRole())));

    }
                
    
}
