package com.itszt.domain;

import lombok.Data;

/**
 * Created by zyy on 2020/2/19.
 */

public class User {
    private Long id;

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User( String username, String password) {
        this.username = username;
        this.password = password;
    }

    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
