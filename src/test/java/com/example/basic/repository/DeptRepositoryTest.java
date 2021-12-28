package com.example.basic.repository;

import com.example.basic.model.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DeptRepositoryTest {
    @Autowired
    DeptRepository deptRepository;


    @Test
    public void addDept(){
        Dept dept=new Dept();
        dept.setId(50);
        dept.setDname("ksa");
        dept.setLoc("가디");
        deptRepository.save(dept);
    }

    @Test
    @Transactional
    //접속이 끊기는 상황을 방지
    public void findDept(){
        Optional<Dept> byId = deptRepository.findById(10);
        Dept dept = byId.get();

        System.out.println(dept);

    }
}