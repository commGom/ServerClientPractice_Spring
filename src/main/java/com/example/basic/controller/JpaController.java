package com.example.basic.controller;

import com.example.basic.model.JavaBoard;
import com.example.basic.repository.JavaBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@CrossOrigin
public class JpaController {
    @Autowired
    private JavaBoardRepository javaBoardRepository;

    @GetMapping("/jpa/add")
    @ResponseBody
    public JavaBoard jpaAddGet(){
        JavaBoard javaBoard=new JavaBoard();
        javaBoard.setTitle("게시판 제목");
        javaBoard.setContent("게시판 내용 입력 중..");
        javaBoard.setMebmerId("23");
        javaBoard.setCreDate(new Date());
        return javaBoardRepository.save(javaBoard);
    }
    @PostMapping("/jpa/add")
    @ResponseBody
    public JavaBoard jpaAddPost(@ModelAttribute JavaBoard javaBoard){
        System.out.println(javaBoard);
        javaBoard.setMebmerId("23");
        javaBoard.setCreDate(new Date());
        return javaBoardRepository.save(javaBoard);
    }
}
