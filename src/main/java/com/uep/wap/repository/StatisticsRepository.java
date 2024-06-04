package com.uep.wap.repository;

import com.uep.wap.model.Statistics;
import com.uep.wap.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticsRepository extends CrudRepository<Statistics, Integer> {
    Statistics findByAces(int aces);
    Statistics findByWinners(int winners);
}
