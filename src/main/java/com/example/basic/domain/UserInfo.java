package com.example.basic.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class UserInfo {
    @Id
    @GeneratedValue
    private int id;
    private String userId;
    private String userPw;
}
