package com.uep.wap.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="roles_id")
    private int roles_id;
    @Column(name = "name")
    private String name;

    @Column(name = "privileges")
    private String privileges;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<User> users;


    public int getRoles_id() {
        return roles_id;
    }

    public void setRoles_id(int roles_id) {
        this.roles_id = roles_id;
    }

    public Roles(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }
}


