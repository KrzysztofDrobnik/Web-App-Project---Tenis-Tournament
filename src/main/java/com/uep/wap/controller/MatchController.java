package com.uep.wap.controller;


import com.uep.wap.dto.MatchDTO;
import com.uep.wap.model.Match;
import com.uep.wap.service.MatchService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping(path = "/matches")
    public String addMatch(@RequestBody MatchDTO matchDTO){
        matchService.addMatch(matchDTO);
        return "Match added!";

    }

    @PutMapping(path = "/matches/{match_id}")
    public String editMatch(@PathVariable int match_id, @RequestBody MatchDTO matchDTO){
        matchService.editMatch(match_id, matchDTO);
        return "Match edited!";

    }

    @GetMapping(path = "/matches")
    public Iterable<Match> getAllMatches(){
        return matchService.getAllMatches();
    }

    @GetMapping(path = "/matches/{match_id}")
    public Optional<Match> findMatchById(@PathVariable int match_id){
        return matchService.findMatchById(match_id);
    }

    @GetMapping(path = "/matches/{match_date}")
    public Match findMatchByDate(@PathVariable String match_date){
        return matchService.findMatchByDate(match_date);
    }

    @GetMapping(path = "/matches/{match_score}")
    public Match findMatchByScore(@PathVariable String match_score){
        return matchService.findMatchByScore(match_score);
    }

    @GetMapping(path = "/matches/{match_winner}")
    public Match findMatchByWinner(@PathVariable String match_winner){
        return matchService.findMatchByWinner(match_winner);
    }

    @DeleteMapping(path = "/matches/{match_id}")
    public String deleteMatchById(@PathVariable int match_id){

        matchService.deleteMatchByID(match_id);
        return "match deleted!";
    }
}
