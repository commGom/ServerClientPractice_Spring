package com.example.basic.controller;

import com.example.basic.model.Sunbyul;
import com.example.basic.repository.SunbyulRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sunbyul/*")
public class ThymeleafSunbyulController {
    @Autowired
    SunbyulRepository sunbyulRepository;

    @GetMapping("/list")
    public void sunbyulHtml(Model model){
        List<Sunbyul> sunbyulList = sunbyulRepository.findAll();
        model.addAttribute("list",sunbyulList);
    }

}
