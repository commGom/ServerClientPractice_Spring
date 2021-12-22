package com.example.basic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class HolidayParking {
    @Id
    @GeneratedValue
    private int id;
    private String institution;
    private String address;
}
