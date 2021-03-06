package com.mgcoder.financialstatementws.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class User {
    @Id
    private Integer id;
    private String username;

    public User() {
        this(0, null);
    }

    public User(String username) {
        this(0, username);
    }

    public User(@NonNull int id, String username) {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
