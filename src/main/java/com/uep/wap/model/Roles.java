package com.uep.wap.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="roles_id")
    private int rolesID;
    @Column(name = "name")
    private String name;

    @Column(name = "privileges")
    private String privileges;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<User> users;


    public int getRolesID() {
        return rolesID;
    }

    public void setRolesID(int roles_id) {
        this.rolesID = roles_id;
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

    public void setUsers(List<User> users) {
        this.users = users;
    }


}


