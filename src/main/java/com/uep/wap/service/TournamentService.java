package com.uep.wap.service;


import com.uep.wap.dto.TournamentDTO;
import com.uep.wap.model.Tournament;
import com.uep.wap.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    public void addTournament(TournamentDTO tournamentDTO){
        Tournament tournament = new Tournament();
        tournament.setStarting_date(tournamentDTO.getStarting_date());
        tournament.setEnding_date(tournamentDTO.getEnding_date());
        tournament.setParticipants_number(tournamentDTO.getParticipants_number());
        tournament.setType(tournamentDTO.getType());
        tournament.setCategory(tournamentDTO.getCategory());
        tournament.setPlace(tournamentDTO.getPlace());

        tournamentRepository.save(tournament);

        System.out.println("Tournament added!");

    }

    public Iterable<Tournament> getAllTournaments(){
        return tournamentRepository.findAll();
    }

    public Optional<Tournament> getTournamentById(int tournament_id){
        return tournamentRepository.findById(tournament_id);
    }

    public void deleteTournamentById(int tournament_id){
        tournamentRepository.deleteById(tournament_id);
    }

    public Tournament findTournamentByStartingDate(String starting_date){
        return tournamentRepository.findByStartingDate(starting_date);
    }

    public Tournament findTournamentByEndingDate(String ending_date){
        return tournamentRepository.findByEndingDate(ending_date);
    }
}
