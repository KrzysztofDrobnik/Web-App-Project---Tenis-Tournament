package com.uep.wap.service;

import com.uep.wap.dto.MatchDTO;
import com.uep.wap.model.Match;
import com.uep.wap.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public void addMatch(MatchDTO matchDTO){
        Match match = new Match();
        match.setDate(matchDTO.getDate());
        match.setAdditional_info(matchDTO.getAdditional_info());
        match.setPlayer1(matchDTO.getPlayer_1());
        match.setPlayer2(matchDTO.getPlayer_2());
        match.setScore(matchDTO.getScore());
        match.setWinner(matchDTO.getWinner());
        matchRepository.save(match);
        System.out.println("Match added!");
    }

    public Iterable<Match> getAllMatches(){
        return matchRepository.findAll();
    }

    public Optional<Match> findMatchById(int match_id){
        return matchRepository.findById(match_id);

    }

    public Match findMatchByDate(String date){
        return matchRepository.findByDate(date);
    }

    public Match findMatchByScore(String score){
        return matchRepository.findByScore(score);
    }

    public Match findMatchByWinner(String winner){
        return matchRepository.findByWinner(winner);
    }

    public void deleteMatchByID(int match_id){
        matchRepository.deleteById(match_id);
    }
}
