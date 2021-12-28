package com.example.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/thymeleaf/*")
public class ThymeleafController {

    @GetMapping("/user")
    public void user(Model model){
        model.addAttribute("name","Park");
        model.addAttribute("number",Math.random()*45+1);
//        resources/template/a/{user}.html
        List<Map<String,Object>> userList=new ArrayList<>();
        Map<String,Object> user=new HashMap<>();
        user.put("userId","z");
        user.put("userName","zoo");
        user.put("userAge",25);
        userList.add(user);
        model.addAttribute("user",user);
    }

    @GetMapping("/userList")
    public Model userList(Model model){
        model.addAttribute("name","Park");
        model.addAttribute("number",Math.random()*45+1);
//        resources/template/a/{user}.html
        List<Map<String,Object>> userList=new ArrayList<>();
        Map<String,Object> user=new HashMap<>();
        user.put("userId","a");
        user.put("userName","apple");
        user.put("userAge",21);
        userList.add(user);
        user=new HashMap<>();
        user.put("userId","b");
        user.put("userName","banana");
        user.put("userAge",22);
        userList.add(user);
        user=new HashMap<>();
        user.put("userId","c");
        user.put("userName","carrot");
        user.put("userAge",23);
        userList.add(user);
        model.addAttribute("userList",userList);

        return model;
    }

    @GetMapping("/mode")
    public void mode(Model model, @RequestParam Map<String,Object> map){
        model.addAttribute("name",map.get("name"));
        model.addAttribute("auth",map.get("auth"));
        model.addAttribute("category",map.get("category"));

    }

    @GetMapping("/pagination")
    public void pagination(Model model, @RequestParam(defaultValue = "1")int page){
        int startPage=(page-1)/10*10+1;
        int endPage=startPage+9;
        model.addAttribute("startPage",startPage);
        model.addAttribute("endPage",endPage);
        model.addAttribute("page",page);
    }
}
