package com.example.basic.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
public class Emp {
    @Id
    @Column(name = "empno")
    private int id;
    private String ename;
    private String job;
    private LocalDateTime hiredate;
    private int sal;
    private Integer comm;
    @ManyToOne
    @JoinColumn(name = "deptno")
    private Dept dept;

    public Emp() {
    }

    public Emp(int id, String ename, String job, LocalDateTime hiredate, int sal, int comm) {
        this.id = id;
        this.ename = ename;
        this.job = job;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno"+dept.getId()+
                '}';
    }
}
