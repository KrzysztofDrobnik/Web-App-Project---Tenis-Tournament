package com.uep.wap.controller;


import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.User;
import com.uep.wap.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(path = "/users")
    public Iterable<User> getAllUsers(){
        return this.userService.getAllUsers();

    }
    @PostMapping(path = "/users")
    public String addUser(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
        return "user added!";

    }

    @GetMapping(path = "/users{user_id}")
    public Optional<User> getUserById(@PathVariable int user_id){
        return userService.getUserById(user_id);

    }

    @GetMapping(path = "/users{user_first_name}")
    public User getUserByFirstName(@PathVariable String user_first_name){
        return userService.findUserByFirstName(user_first_name);
    }

    @GetMapping(path = "/users{user_last_name}")
    public User getUserByLastName(@PathVariable String user_last_name){
        return userService.findUserByLastName(user_last_name);
    }

    @GetMapping(path = "/users{user_email}")
    public User getUserByEmail(@PathVariable String user_email){
        return userService.findUserByEmail(user_email);
    }

    @DeleteMapping(path = "/users{id}")
    public String deleteUserById(@PathVariable int user_id){
        userService.deleteUserById(user_id);
        return "User deleted!";
    }



}
