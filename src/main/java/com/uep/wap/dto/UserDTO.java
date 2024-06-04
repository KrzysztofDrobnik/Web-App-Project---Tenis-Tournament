package com.uep.wap.dto;

public class UserDTO {

    private String first_name;
    private String last_name;
    private String gender;
    private int age;
    private String email;
    //private String login
    //private String password
    private String roleName;
    private int playerID;



    public int getPlayerID() {
        return playerID;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
