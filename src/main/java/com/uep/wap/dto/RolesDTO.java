package com.uep.wap.dto;

public class RolesDTO {

    private String name;
    private String privileges;
    private String userLastName;

    public String getUserLastName() {
        return userLastName;
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
