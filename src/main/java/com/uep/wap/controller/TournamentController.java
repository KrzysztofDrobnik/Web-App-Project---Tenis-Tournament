package com.uep.wap.controller;


import com.uep.wap.dto.TournamentDTO;
import com.uep.wap.model.Tournament;
import com.uep.wap.service.TournamentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public String addTournament(@RequestBody TournamentDTO tournamentDTO){

        tournamentService.addTournament(tournamentDTO);
        return "Tournament added!";

    }


}
