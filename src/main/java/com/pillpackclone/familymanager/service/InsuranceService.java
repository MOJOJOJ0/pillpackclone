package com.pillpackclone.familymanager.service;

import com.pillpackclone.familymanager.exception.UserNotFoundException;
import com.pillpackclone.familymanager.model.User;
import com.pillpackclone.familymanager.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InsuranceService {
    private final InsuranceRepository insuranceRepository;

    @Autowired // ! to do crud ops
    public InsuranceService(InsuranceRepository insuranceRepository) {
        this.insuranceRepository = insuranceRepository;
    }

    public User addUser(User user) {
//       user.setPhoneNumber(UUID.randomUUID().toString()); // ! gives a user a random ph# for id use and saves it in repo
        return insuranceRepository.save(user);
    }

    public List<User> findAllUsers() {
        return insuranceRepository.findAll(); // ! method to show all users in db
    }

    public User updateUser(User user){
        return insuranceRepository.save(user); // ! update and save the users
    }

    public User findUserById(Long id){
        return insuranceRepository.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + "was not found")); // ! finds user by id
    }

    public void deleteUser(Long id){
        insuranceRepository.deleteUserById(id); // ! method to delete the user
    }


}
