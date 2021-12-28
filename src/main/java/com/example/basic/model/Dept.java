package com.example.basic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Dept {
    @Id
    @Column(name = "deptno")
    private int id;
    private String dname;
    private String loc;

    @OneToMany(mappedBy = "dept")
    @JsonIgnore
    private List<Emp> empList;
}
