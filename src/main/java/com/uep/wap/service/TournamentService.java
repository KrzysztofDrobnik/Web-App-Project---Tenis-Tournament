package com.uep.wap.service;


import com.uep.wap.dto.TournamentDTO;
import com.uep.wap.model.Tournament;
import com.uep.wap.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
