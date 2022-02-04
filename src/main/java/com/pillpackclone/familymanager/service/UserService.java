package com.pillpackclone.familymanager.service;

import com.pillpackclone.familymanager.exception.UserNotFoundException;
import com.pillpackclone.familymanager.model.User;
import com.pillpackclone.familymanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired // ! to do crud ops
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
//       user.setPhoneNumber(UUID.randomUUID().toString()); // ! gives a user a random ph# for id use and saves it in repo
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll(); // ! method to show all users in db
    }

    public User updateUser(User user){
        return userRepository.save(user); // ! update and save the users
    }

    public User findUserById(Long id){
        return userRepository.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + "was not found")); // ! finds user by id
    }

    public String deleteUser(Long id){
        userRepository.deleteUserById(id); // ! method to delete the user
        return null;
    }


}
