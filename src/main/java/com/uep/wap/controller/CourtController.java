package com.uep.wap.controller;

import com.uep.wap.dto.CourtDTO;
import com.uep.wap.model.Court;
import com.uep.wap.service.CourtService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class CourtController {

    private final CourtService courtService;

    public CourtController(CourtService courtService) {
        this.courtService = courtService;
    }

    @GetMapping(path = "/courts")
    public Iterable<Court> getAllCourts(){
        return courtService.gettAllCourts();
    }

    @PostMapping(path = "/courts")
    public String addCourt(@RequestBody CourtDTO courtDTO){
        courtService.addCourt(courtDTO);
        return "Court added!";
    }

    @GetMapping(path = "/courts{court_id}")
    public Optional<Court> findCourtById(@PathVariable int court_id){
        return courtService.findCourtById(court_id);

    }

    @GetMapping(path = "/courts{court_name}")
    public Court findCourtByName(@PathVariable String court_name){
        return courtService.findCourtByName(court_name);
    }

    @GetMapping(path = "/courts{court_surface}")
    public Court findCourtBySurface(@PathVariable String court_surface){
        return courtService.findCourtBySurface(court_surface);
    }

    @DeleteMapping(path = "/courts{id}")
    public String deleteCourtById(@PathVariable int court_id){
        courtService.deleteCourtById(court_id);
        return "Court deleted!";

    }
}
