package com.example.basic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Demo {
    @Id
    @GeneratedValue
    private Long seq;
    private String user;
}
