package com.uep.wap.service;

import com.uep.wap.dto.CourtDTO;
import com.uep.wap.model.Court;
import com.uep.wap.repository.CourtRepository;
import org.apache.coyote.ContinueResponseTiming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourtService {
    
    @Autowired
    private CourtRepository courtRepository;

    public void addCourt(CourtDTO courtDTO){
        Court court = new Court();
        court.setName(courtDTO.getName());
        court.setSurface(courtDTO.getSurface());
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
