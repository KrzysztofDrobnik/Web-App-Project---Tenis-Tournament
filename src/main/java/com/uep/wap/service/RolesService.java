package com.uep.wap.service;

import com.uep.wap.dto.RolesDTO;
import com.uep.wap.model.Roles;
import com.uep.wap.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolesService {

    @Autowired
    private RolesRepository rolesRepository;

    public void addRole(RolesDTO rolesDTO){
        Roles roles = new Roles();
        roles.setName(rolesDTO.getName());
        roles.setPrivileges(rolesDTO.getPrivileges());
        rolesRepository.save(roles);
        System.out.println("Roles added!");

    }

    public Iterable<Roles> getAllRoles(){
        return rolesRepository.findAll();
    }

    public Optional<Roles> findRolesById(int roles_id){
        return rolesRepository.findById(roles_id);
    }

    public Roles findRolesByName(String roles_name){
        return rolesRepository.findByName(roles_name);
    }

    public void deleteRolesById(int roles_id){
        rolesRepository.deleteById(roles_id);
    }
}