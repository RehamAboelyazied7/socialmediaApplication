package com.in28minutescourse.rest.service.restfuldemo.user;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import java.util.Date;

public class User {
    private Integer id;
    @Size(min = 3, message = "name should have at least 3 character")
    private String name;
    @Past
    private Date birthDate;

    public User(){

    }

    public User(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.birthDate = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


}
