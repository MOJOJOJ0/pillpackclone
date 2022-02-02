package com.pillpackclone.familymanager.repository;

import com.pillpackclone.familymanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    void deleteUserById(Long id); // ! long pk type, query method coz naming convention, method, class name, field, spring will create query

    Optional<User> findUserById(Long id); // ! find whatever that's passed in there, spring query method, since random id therefore optional
}
