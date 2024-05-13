package com.uep.wap.repository;


import com.uep.wap.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByFirstName(String first_name);
    User findByLastName(String last_name);
    User findByEmail(String email);
}
