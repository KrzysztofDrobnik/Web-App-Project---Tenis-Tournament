package com.uep.wap.controller;


import com.uep.wap.dto.OrganizerDTO;
import com.uep.wap.model.Organizer;
import com.uep.wap.service.OrganizerService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class OrganizerController {

    private final OrganizerService organizerService;


    public OrganizerController(OrganizerService organizerService) {
        this.organizerService = organizerService;
    }

    @GetMapping(path = "/organizers")
    public Iterable<Organizer> gettAllOrganizers(){
        return organizerService.getAllOrganizers();
    }

    @PostMapping(path = "/organizers")
    public String addOrganizer(@RequestBody OrganizerDTO organizerDTO){
        organizerService.addOrganizer(organizerDTO);
        return "Organizer added!";

    }

    @PutMapping(path = "/organizers/{organizer_id}")
    public String editOrganizer(@PathVariable int organizer_id, @RequestBody OrganizerDTO organizerDTO){
        organizerService.editOrganizer(organizer_id, organizerDTO);
        return "Organizer edited!";

    }

    @GetMapping(path = "/organizers/{organizer_id}")
    public Optional<Organizer> findOrganizerById(@PathVariable int organizer_id){
        return organizerService.findOrganizerById(organizer_id);


    }

    @GetMapping(path = "/organizers/{organizer_name}")
    public Organizer findOrganizerByName(@PathVariable String organizer_name){
        return organizerService.findOrganizerByName(organizer_name);

    }

    @DeleteMapping(path = "/organizers/{organizer_id}")
    public String deleteOrganizerById(@PathVariable int organizer_id){
        organizerService.deleteOrganizerById(organizer_id);
        return "Organizer deleted!";
    }
}
