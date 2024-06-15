package com.uep.wap.repository;

import com.uep.wap.model.Roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends CrudRepository<Roles, Integer> {

    Roles findByName(String name);
}
