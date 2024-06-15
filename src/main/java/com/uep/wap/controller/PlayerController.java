package com.uep.wap.controller;


import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import com.uep.wap.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping(path = "/players")
    public Iterable<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @PostMapping(path = "/players")
    public String addPlayers(@RequestBody PlayerDTO playerDTO){
        playerService.addPlayer(playerDTO);
        return "Players added!";

    }

    @PutMapping(path = "/players/{player_id}")
    public String editPlayers(@PathVariable int player_id, @RequestBody PlayerDTO playerDTO){
        playerService.editPlayer(player_id, playerDTO);
        return "Players edited!";

    }

    @GetMapping(path = "/players/{player_id}")
    public Optional<Player> findPlayerById(@PathVariable int player_id){
        return playerService.findPlayerById(player_id);
    }

    @DeleteMapping(path = "/players/{player_id}")
    public String deletePlayerById(@PathVariable int player_id){
        playerService.deletePlayerById(player_id);
        return "Player deleted!";
    }
}
