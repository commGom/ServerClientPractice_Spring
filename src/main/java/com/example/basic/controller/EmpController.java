package com.example.basic.controller;

import com.example.basic.model.Emp;
import com.example.basic.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emp/*")
public class EmpController {
    @Autowired
    private EmpRepository empRepository;

    @GetMapping("/list")
    @ResponseBody
    public List<Emp> emp(){
        return empRepository.findAll();
    }
}
