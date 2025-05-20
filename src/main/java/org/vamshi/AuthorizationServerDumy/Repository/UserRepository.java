package org.vamshi.AuthorizationServerDumy.Repository;

import org.vamshi.AuthorizationServerDumy.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {

    static User findByEmail(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByEmail'");
    }
    
}
