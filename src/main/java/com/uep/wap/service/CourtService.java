package com.uep.wap.service;

import com.uep.wap.dto.CourtDTO;
import com.uep.wap.model.Court;
import com.uep.wap.model.Match;
import com.uep.wap.repository.CourtRepository;
import com.uep.wap.repository.MatchRepository;
import org.apache.coyote.ContinueResponseTiming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourtService {
    
    @Autowired
    private CourtRepository courtRepository;
    @Autowired
    private MatchRepository matchRepository;


    public void addCourt(CourtDTO courtDTO){
        Court court = new Court();
        court.setName(courtDTO.getName());
        court.setSurface(courtDTO.getSurface());


        List<Match> matches = new ArrayList<>();
        if(!courtDTO.getMatchDate().isEmpty()) {
            Match match = matchRepository.findByDate(courtDTO.getMatchDate());
            matches.add(match);
            court.setMatches(matches);
        }

        courtRepository.save(court);
        System.out.println("Court added!");




    }

    public Iterable<Court> gettAllCourts(){
        return courtRepository.findAll();
    }

    public Optional<Court> findCourtById(int court_id){
        return courtRepository.findById(court_id);
    }

    public Court findCourtByName(String court_name){
        return courtRepository.findByName(court_name);
    }

    public Court findCourtBySurface(String court_surface){
        return courtRepository.findBySurface(court_surface);
    }

    public void deleteCourtById(int court_id){
        courtRepository.deleteById(court_id);
    }


}
