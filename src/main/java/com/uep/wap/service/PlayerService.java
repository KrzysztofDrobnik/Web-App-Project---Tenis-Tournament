package com.uep.wap.service;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Match;
import com.uep.wap.model.Player;
import com.uep.wap.model.User;
import com.uep.wap.repository.MatchRepository;
import com.uep.wap.repository.PlayerRepository;
import com.uep.wap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private UserRepository userRepository;

    public void addPlayer(PlayerDTO playerDTO){
        Player player = new Player();
        player.setNumberOfGames(playerDTO.getNumberOfGames());
        player.setTournamentsWon(playerDTO.getTournamentsWon());
        player.setSuccesses(playerDTO.getSuccesses());

        List<Match> matches = new ArrayList<>();
        if(!playerDTO.getMatchDate().isEmpty()) {
            Match match = matchRepository.findByDate(playerDTO.getMatchDate());
            matches.add(match);
            player.setMatches(matches);
        }

        if(!playerDTO.getMatchDate().isEmpty()) {
            User user = userRepository.findByLastName(playerDTO.getUserLastName());
            player.setUser(user);
        }





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
