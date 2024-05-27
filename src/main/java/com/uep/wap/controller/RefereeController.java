package com.uep.wap.controller;


import com.uep.wap.dto.RefereeDTO;
import com.uep.wap.model.Referee;
import com.uep.wap.service.RefereeService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class RefereeController {

    private final RefereeService refereeService;


    public RefereeController(RefereeService refereeService) {
        this.refereeService = refereeService;
    }

    @GetMapping(path = "/referees")
    public Iterable<Referee> getAllReferees(){
        return refereeService.getAllReferees();
    }

    @PostMapping(path = "/referees")
    public String addReferee(@RequestBody RefereeDTO refereeDTO){
        refereeService.addReferee(refereeDTO);
        return "Referee added!";
    }

    @GetMapping(path = "/referees/{referee_id}")
    public Optional<Referee> findRefereeById(@PathVariable int referee_id){
        return refereeService.getRefereeById(referee_id);
    }

    @GetMapping(path = "/referees/{first_name}")
    public Referee findRefereeByFirstName(@PathVariable String first_name){
        return refereeService.findRefereeByFirstName(first_name);
    }


    @GetMapping(path = "/referees/{last_name}")
    public Referee findRefereeByLastName(@PathVariable String last_name){
        return refereeService.findRefereeByLastName(last_name);
    }


    @DeleteMapping(path = "/referees/{referee_id}")
    public String deleteRefereeById(@PathVariable int referee_id){
        refereeService.deleteRefereeById(referee_id);
        return "Referee deleted!";

    }

}
