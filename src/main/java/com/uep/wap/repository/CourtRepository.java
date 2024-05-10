package com.uep.wap.repository;

import com.uep.wap.model.Court;
import com.uep.wap.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourtRepository extends CrudRepository<Court, Integer> {

    Court findByName(String name);
    Court findBySurface(String surface);
}
