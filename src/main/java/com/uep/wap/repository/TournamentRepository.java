package com.uep.wap.repository;

import com.uep.wap.model.Tournament;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends CrudRepository<Tournament, Integer> {

    Tournament findByStartingDate(String starting_date);
    Tournament findByEndingDate(String ending_date);
}
