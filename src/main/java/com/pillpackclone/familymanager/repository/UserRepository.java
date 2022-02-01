package com.pillpackclone.familymanager.repository;

import com.pillpackclone.familymanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { // ! long pk type

}
