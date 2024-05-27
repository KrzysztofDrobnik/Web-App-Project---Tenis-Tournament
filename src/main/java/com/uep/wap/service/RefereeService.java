package com.uep.wap.service;


import com.uep.wap.dto.RefereeDTO;
import com.uep.wap.model.Match;
import com.uep.wap.model.Referee;
import com.uep.wap.repository.MatchRepository;
import com.uep.wap.repository.RefereeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RefereeService {

    @Autowired
    private RefereeRepository refereeRepository;
    @Autowired
    private MatchRepository matchRepository;

    public void addReferee(RefereeDTO refereeDTO){
        Referee referee = new Referee();
        referee.setFirstName(refereeDTO.getFirst_name());
        referee.setLastName(refereeDTO.getLast_name());

        List<Match> matches = new ArrayList<>();
        Match match = matchRepository.findByDate(refereeDTO.getMatchDate());
        matches.add(match);
        referee.setMatches(matches);

        refereeRepository.save(referee);
        System.out.println("Referee added!");

    }

    public Iterable<Referee> getAllReferees(){
        return refereeRepository.findAll();
    }

    public Optional<Referee> getRefereeById(int referee_id){
        return refereeRepository.findById(referee_id);
    }

    public Referee findRefereeByFirstName(String first_name){
        return refereeRepository.findByFirstName(first_name);
    }

    public Referee findRefereeByLastName(String last_name){
        return refereeRepository.findByLastName(last_name);
    }

    public void deleteRefereeById(int referee_id){
        refereeRepository.deleteById(referee_id);
    }
}
