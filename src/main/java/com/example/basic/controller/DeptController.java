package com.example.basic.controller;

import com.example.basic.model.Dept;
import com.example.basic.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dept/*")
public class DeptController {

    @Autowired
    private DeptRepository deptRepository;

    @ResponseBody
    @GetMapping("/list/{deptno}")
    public Dept findEmpListByDeptno(@PathVariable("deptno")int deptno){
        return deptRepository.findById(deptno).get();
    }
}
