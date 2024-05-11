package com.uep.wap.repository;

import com.uep.wap.model.Organizer;
import com.uep.wap.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrganizerRepository extends CrudRepository<Organizer, Integer> {

    Organizer findByName(String name);
}
