package com.pillpackclone.familymanager.service;

import com.pillpackclone.familymanager.exception.UserNotFoundException;
import com.pillpackclone.familymanager.model.User;
import com.pillpackclone.familymanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public User findUserById(Long id){
        return userRepository.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + "was not found"));
    }

    public void deleteUser(Long id){ // string?
        userRepository.deleteUserById(id);
        //return null;
    }


}
