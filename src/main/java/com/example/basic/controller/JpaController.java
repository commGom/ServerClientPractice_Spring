package com.example.basic.controller;

import com.example.basic.model.JavaBoard;
import com.example.basic.repository.JavaBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class JpaController {
    @Autowired
    private JavaBoardRepository javaBoardRepository;

    @GetMapping("/jpa/add")
    @ResponseBody
    public JavaBoard jpaAdd(){
        JavaBoard javaBoard=new JavaBoard();
        javaBoard.setTitle("게시판 제목");
        javaBoard.setContent("게시판 내용 입력 중..");
        javaBoard.setMebmerId("23");
        javaBoard.setCreDate(new Date());
        return javaBoardRepository.save(javaBoard);
    }
}
