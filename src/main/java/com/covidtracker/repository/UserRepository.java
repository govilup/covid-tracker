package com.covidtracker.repository;

import com.covidtracker.entity.User;
import com.covidtracker.repository.jparepository.UserJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserRepository {

    @Autowired
    UserJPARepository userJPARepository;

    public User registerUser(User user) {
        return userJPARepository.save(user);
    }

    public User getUserById(Long userId) {
        Optional<User> optionalUser = userJPARepository.findById(userId);
        return optionalUser.orElse(null);
    }
}
