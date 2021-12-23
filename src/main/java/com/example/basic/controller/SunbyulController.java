package com.example.basic.controller;

import com.example.basic.model.Sunbyul;
import com.example.basic.repository.SunbyulRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SunbyulController {
    @Autowired
    private SunbyulRepository sunbyulRepository;

    @GetMapping("/sunbyul")
    @ResponseBody
    public Page<Sunbyul> findAllWithPaging(@RequestParam("page") int page){
        return sunbyulRepository.findAll(PageRequest.of(page,10));
    }

    @GetMapping("/sunbyul/{address}")
    @ResponseBody
    public List<Sunbyul> findByAddress(@PathVariable("address") String address){
        return sunbyulRepository.findByAddressContaining(address);
    }

    @GetMapping("/sunbyulpage")
    @ResponseBody
    public List<Sunbyul> findByAddressWithPaging(@RequestParam("address") String address, @RequestParam("page") int page){
        return sunbyulRepository.findByAddressContaining(address, PageRequest.of(page,10));
    }
}
