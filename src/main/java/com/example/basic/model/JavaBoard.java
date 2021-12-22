package com.example.basic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Data
public class JavaBoard {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String content;
    private String mebmerId;
    private Date creDate;
}
