package com.example.basic.controller;

import com.example.basic.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//컴포넌트 Scan의 대상
@Controller
public class HtmlController {

    @GetMapping("/")
    public String home(){
        return "html/string";
    }

    @GetMapping("html/void")
    public void htmlVoid(){

    }

    @GetMapping("html/object")
    @ResponseBody
    public Member htmlObject(){
        Member member=new Member();
        member.setName("Kim");
        return member;
    }

    @GetMapping("html/exam")
    public void htmlExam(){

    }

}
