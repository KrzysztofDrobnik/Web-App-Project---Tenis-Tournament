package com.uep.wap.repository;

import com.uep.wap.model.Draw;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DrawRepository extends CrudRepository<Draw, Integer> {
}
