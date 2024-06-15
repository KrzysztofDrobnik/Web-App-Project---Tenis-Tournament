package com.uep.wap.repository;

import com.uep.wap.model.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MatchRepository extends CrudRepository<Match, Integer> {

    Match findByDate(String date);
    Match findByScore(String score);
    Match findByWinner(String winner);
}
