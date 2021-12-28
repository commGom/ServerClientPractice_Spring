package com.example.basic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private Team team;
}
