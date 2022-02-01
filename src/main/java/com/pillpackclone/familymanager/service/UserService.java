package com.pillpackclone.familymanager.service;

import com.pillpackclone.familymanager.model.User;
import com.pillpackclone.familymanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired // ! to do crud ops
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        user.setPhoneNumber(UUID.randomUUID().toString()); // ! gives a user a random ph# for id use and saves it in repo
        return userRepository.save(user);

    }
}
