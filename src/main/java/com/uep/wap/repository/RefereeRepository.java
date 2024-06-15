package com.uep.wap.repository;

import com.uep.wap.model.Referee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RefereeRepository extends CrudRepository<Referee, Integer> {

    Referee findByFirstName(String first_name);
    Referee findByLastName(String last_name);
}
