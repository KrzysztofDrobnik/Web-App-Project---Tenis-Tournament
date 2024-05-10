package com.uep.wap.service;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import com.uep.wap.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public void addPlayer(PlayerDTO playerDTO){
        Player player = new Player();
        player.setNumberOfGames(playerDTO.getNumberOfGames());
        player.setTournamentsWon(playerDTO.getTournamentsWon());
        player.setSuccesses(playerDTO.getSuccesses());
        playerRepository.save(player);
        System.out.println("Player added!");

    }


    public Iterable<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Optional<Player> findPlayerById(int player_id){
        return playerRepository.findById(player_id);
    }

    public void deletePlayerById(int player_id){
        playerRepository.deleteById(player_id);
    }

}
