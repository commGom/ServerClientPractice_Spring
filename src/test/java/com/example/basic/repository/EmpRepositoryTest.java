package com.example.basic.repository;

import com.example.basic.model.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmpRepositoryTest {
    @Autowired
    EmpRepository empRepository;
    @Autowired
    DeptRepository deptRepository;

    @Test
    public void showEmpNames(){
        List<Emp> all = empRepository.findAll();
        for (Emp emp : all) {
            System.out.println(String.format("%s 사원님, 부서명 : %s, 부서위치 : %s",emp.getEname(),emp.getDept().getDname(),emp.getDept().getLoc()));
        }
    }
}