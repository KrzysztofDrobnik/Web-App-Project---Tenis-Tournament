package com.uep.wap.service;

import com.uep.wap.dto.MatchDTO;
import com.uep.wap.model.*;
import com.uep.wap.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private CourtRepository courtRepository;
    @Autowired
    private TournamentRepository tournamentRepository;
    @Autowired
    private RefereeRepository refereeRepository;
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private StatisticsRepository statisticsRepository;


    public void addMatch(MatchDTO matchDTO){
        Match match = new Match();
        match.setDate(matchDTO.getDate());
        match.setAdditionalInfo(matchDTO.getAdditional_info());
        match.setPlayer1(matchDTO.getPlayer_1());
        match.setPlayer2(matchDTO.getPlayer_2());
        match.setScore(matchDTO.getScore());
        match.setWinner(matchDTO.getWinner());

        List<Court> courts = new ArrayList<>();
        if(!matchDTO.getCourtName().isEmpty()) {
            Court court = courtRepository.findByName(matchDTO.getCourtName());
            courts.add(court);
            match.setCourts(courts);
        }

        List<Referee> referees = new ArrayList<>();
        if (!matchDTO.getRefereeLastName().isEmpty()) {
            Referee referee = refereeRepository.findByLastName(matchDTO.getRefereeLastName());
            referees.add(referee);
            match.setReferees(referees);
        }

        if(!matchDTO.getTournamentStartingDate().isEmpty()) {
            Tournament tournament = tournamentRepository.findByStartingDate(matchDTO.getTournamentStartingDate());
            match.setTournament(tournament);
        }

        List<Player> players = new ArrayList<>();
        if (matchDTO.getPlayerID() != 0) {
            Player player = playerRepository.findById(matchDTO.getPlayerID()).get();
            players.add(player);
            match.setPlayers(players);
        }

        if(matchDTO.getStatisticsID() != 0) {

            Statistics statistics = statisticsRepository.findById(matchDTO.getStatisticsID()).get();
            match.setStatistics(statistics);
        }


        matchRepository.save(match);
        System.out.println("Match added!");



    }

    public void editMatch(int match_id, MatchDTO matchDTO){
        Match match = matchRepository.findById(match_id).get();
        match.setDate(matchDTO.getDate());
        match.setAdditionalInfo(matchDTO.getAdditional_info());
        match.setPlayer1(matchDTO.getPlayer_1());
        match.setPlayer2(matchDTO.getPlayer_2());
        match.setScore(matchDTO.getScore());
        match.setWinner(matchDTO.getWinner());

        List<Court> courts = new ArrayList<>();
        if(!matchDTO.getCourtName().isEmpty()) {
            Court court = courtRepository.findByName(matchDTO.getCourtName());
            courts.add(court);
            match.setCourts(courts);
        }

        List<Referee> referees = new ArrayList<>();
        if (!matchDTO.getRefereeLastName().isEmpty()) {
            Referee referee = refereeRepository.findByLastName(matchDTO.getRefereeLastName());
            referees.add(referee);
            match.setReferees(referees);
        }

        if(!matchDTO.getTournamentStartingDate().isEmpty()) {
            Tournament tournament = tournamentRepository.findByStartingDate(matchDTO.getTournamentStartingDate());
            match.setTournament(tournament);
        }

        List<Player> players = new ArrayList<>();
        if (matchDTO.getPlayerID() != 0) {
            Player player = playerRepository.findById(matchDTO.getPlayerID()).get();
            players.add(player);
            match.setPlayers(players);
        }

        if(matchDTO.getStatisticsID() != 0) {

            Statistics statistics = statisticsRepository.findById(matchDTO.getStatisticsID()).get();
            match.setStatistics(statistics);
        }


        matchRepository.save(match);
        System.out.println("Match edited!");



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
