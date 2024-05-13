package com.uep.wap.controller;


import com.uep.wap.dto.TournamentDTO;
import com.uep.wap.model.Tournament;
import com.uep.wap.service.TournamentService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class TournamentController {

    private final TournamentService tournamentService;

    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }


    @GetMapping(path = "/tournaments")
    public Iterable<Tournament> getAllTournaments(){
        return this.tournamentService.getAllTournaments();
    }

    @PostMapping(path = "/tournaments")
    public String addTournament(@RequestBody TournamentDTO tournamentDTO){

        tournamentService.addTournament(tournamentDTO);
        return "Tournament added!";

    }

    @GetMapping(path = "/tournaments{tournament_id}")
    public Optional<Tournament> getTournamentById(@PathVariable int tournament_id){
        return tournamentService.getTournamentById(tournament_id);
    }

    @GetMapping(path = "/tournaments{starting_date}")
    public Tournament findTournamentByStartingDate(@PathVariable String tournament_starting_date){
        return tournamentService.findTournamentByStartingDate(tournament_starting_date);
    }

    @GetMapping(path = "/tournaments{ending_date}")
    public Tournament findTournamentByEndingDate(@PathVariable String tournament_ending_date){
        return tournamentService.findTournamentByEndingDate(tournament_ending_date);
    }

    @DeleteMapping(path = "/tournaments{id}")
    public void deleteTournamentById(@PathVariable int tournament_id){
        tournamentService.deleteTournamentById(tournament_id);
    }


}
