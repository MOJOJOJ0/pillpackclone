package com.pillpackclone.familymanager.controller;

import com.pillpackclone.familymanager.exception.UserNotFoundException;
import com.pillpackclone.familymanager.model.User;
import com.pillpackclone.familymanager.service.UserService;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController<T> {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users") // ! first method in this class, returns all users, get request
    public ResponseEntity<List<User>> getAllUsers () { // ! http response, spring class, generic
        List<User> users = userService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK); // ! get 200 response
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> getUserById (@PathVariable("id") Long id) {
        User user = userService.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED); // ! created something on the server
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK); // ! if ok on backend then ok to frontend
    }

//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
//        userService.deleteUser(id);
//        return new ResponseEntity<>(HttpStatus.OK); // ! this whole thing mirrors whatever was inside service
//
//    }

//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
//    public Optional<User> deleteUser(@PathVariable value = Long id) {
//        return userService.deleteUser(id);
//        //return new ResponseEntity<>(HttpStatus.OK);
//    }


    @DeleteMapping("{id}")
    public String deleteCategory(@PathVariable(value = "id") Long id) {
        return userService.deleteUser(id);
    }

//    @DeleteMapping("/categories/{categoryId}")
//    public Optional<User> deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
//        System.out.println("calling deleteCategory ==>");
//        SimpleJpaRepository<T, Long> userRepository = null;
//        Optional<User> category = (Optional<User>) userRepository.findById(categoryId);
//
//        if (category.isPresent()) {
//            userRepository.deleteById(categoryId);
//            return category;
//        } else {
//            throw new UserNotFoundException("category with id " + categoryId + " not found");
//        }
    }



//}
