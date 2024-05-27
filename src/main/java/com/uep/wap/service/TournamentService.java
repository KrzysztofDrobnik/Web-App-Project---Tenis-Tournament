package com.uep.wap.service;


import com.uep.wap.dto.TournamentDTO;
import com.uep.wap.model.Match;
import com.uep.wap.model.Organizer;
import com.uep.wap.model.Tournament;
import com.uep.wap.repository.MatchRepository;
import com.uep.wap.repository.OrganizerRepository;
import com.uep.wap.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private OrganizerRepository organizerRepository;

    public void addTournament(TournamentDTO tournamentDTO){
        Tournament tournament = new Tournament();
        tournament.setStartingDate(tournamentDTO.getStarting_date());
        tournament.setEndingDate(tournamentDTO.getEnding_date());
        tournament.setParticipantsNumber(tournamentDTO.getParticipants_number());
        tournament.setType(tournamentDTO.getType());
        tournament.setCategory(tournamentDTO.getCategory());
        tournament.setPlace(tournamentDTO.getPlace());

        List<Match> matches = new ArrayList<>();
        Match match = matchRepository.findByDate(tournamentDTO.getMatchDate());
        matches.add(match);
        tournament.setMatches(matches);

        Organizer organizer = organizerRepository.findByName(tournamentDTO.getOrganizerName());
        tournament.setOrganizer(organizer);



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
