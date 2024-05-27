package com.uep.wap.service;


import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.Roles;
import com.uep.wap.model.User;
import com.uep.wap.repository.RolesRepository;
import com.uep.wap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RolesRepository rolesRepository;

    public void addUser(UserDTO userDTO){
        User user = new User();
        user.setFirstName(userDTO.getFirst_name());
        user.setLastName(userDTO.getLast_name());
        user.setGender(userDTO.getGender());
        user.setAge(userDTO.getAge());
        user.setEmail(userDTO.getEmail());

        Roles roles = rolesRepository.findByName(userDTO.getRoleName());
        user.setRole(roles);

        userRepository.save(user);
        System.out.println("User added!");

    }

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int user_id){
        return userRepository.findById(user_id);
    }

    public User findUserByFirstName(String first_name){
        return userRepository.findByFirstName(first_name);
    }

    public User findUserByLastName(String last_name){
        return userRepository.findByLastName(last_name);
    }
    public User findUserByEmail(String user_email){
        return userRepository.findByEmail(user_email);
    }

    public void deleteUserById(int user_id){
        userRepository.deleteById(user_id);
    }


}
