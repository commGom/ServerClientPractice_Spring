package com.example.basic.domain;

import lombok.Data;

@Data
public class User {
    private String name;
    private String userId;
    private String userPassword;

    public User() {
    }

    public User(String name, String userId, String userPassword) {
        this.name = name;
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
