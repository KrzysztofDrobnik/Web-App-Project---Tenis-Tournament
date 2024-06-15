package com.uep.wap.controller;


import com.uep.wap.dto.RolesDTO;
import com.uep.wap.model.Roles;
import com.uep.wap.service.RolesService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class RolesController {

    private final RolesService rolesService;


    public RolesController(RolesService rolesService) {
        this.rolesService = rolesService;
    }

    @GetMapping(path = "/roles")
    public Iterable<Roles> getAllRoles(){
        return rolesService.getAllRoles();
    }


    @PostMapping(path = "/roles")
    public String addRoles(@RequestBody RolesDTO rolesDTO){
        rolesService.addRole(rolesDTO);
        return "Role added!";
    }

    @PutMapping(path = "/roles/{roles_id}")
    public String editRoles(@PathVariable int roles_id, @RequestBody RolesDTO rolesDTO){
        rolesService.editRole(roles_id, rolesDTO);
        return "Role edited!";
    }


    @GetMapping(path = "/roles/{roles_id}")
    public Optional<Roles> findRolesById(@PathVariable int roles_id){
        return rolesService.findRolesById(roles_id);
    }

    @GetMapping(path = "/roles/{roles_name}")
    public Roles findRolesByName(@PathVariable String roles_name){
        return rolesService.findRolesByName(roles_name);
    }



    @DeleteMapping(path = "/roles/{roles_id}")
    public String deleteRolesById(@PathVariable int roles_id){
        rolesService.deleteRolesById(roles_id);
        return "Role deleted!";
    }


}
