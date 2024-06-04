package com.uep.wap.service;


import com.uep.wap.dto.OrganizerDTO;
import com.uep.wap.model.Organizer;
import com.uep.wap.model.Tournament;
import com.uep.wap.repository.OrganizerRepository;
import com.uep.wap.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrganizerService {

    @Autowired
    private OrganizerRepository organizerRepository;
    @Autowired
    private TournamentRepository tournamentRepository;

    public void addOrganizer(OrganizerDTO organizerDTO){
        Organizer organizer = new Organizer();
        organizer.setName(organizerDTO.getName());
        organizer.setDescription(organizerDTO.getDescription());

        List<Tournament> tournaments = new ArrayList<>();
        if (!organizerDTO.getTournamentStartingDate().isEmpty()) {

            Tournament tournament = tournamentRepository.findByStartingDate(organizerDTO.getTournamentStartingDate());
            tournaments.add(tournament);
            organizer.setTournaments(tournaments);
        }

        organizerRepository.save(organizer);
        System.out.println("Organizer added!");
    }

    public Iterable<Organizer> getAllOrganizers(){
        return organizerRepository.findAll();
    }

    public Optional<Organizer> findOrganizerById(int organizer_id){
        return organizerRepository.findById(organizer_id);
    }

    public Organizer findOrganizerByName(String organizer_name){
        return organizerRepository.findByName(organizer_name);
    }

    public void deleteOrganizerById(int organizer_id){
        organizerRepository.deleteById(organizer_id);
    }


}
