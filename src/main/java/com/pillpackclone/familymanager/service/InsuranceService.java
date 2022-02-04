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

    @Autowired
    public InsuranceService(InsuranceRepository insuranceRepository) {
        this.insuranceRepository = insuranceRepository;
    }

    public User addUser(User user) {
        return insuranceRepository.save(user);
    }

    public List<User> findAllUsers() {
        return insuranceRepository.findAll();
    }

    public User updateUser(User user){
        return insuranceRepository.save(user);
    }

    public User findUserById(Long id){
        return insuranceRepository.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + "was not found"));
    }

    public void deleteUser(Long id){
        insuranceRepository.deleteUserById(id);
    }


}
