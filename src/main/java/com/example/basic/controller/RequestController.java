package com.example.basic.controller;

import com.example.basic.domain.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class RequestController {
    @GetMapping("req/data")
    public Map data(@RequestParam Map<String,Object> map){
        return map;
    }
    @GetMapping("req/model")
    public String model(@ModelAttribute User user){
        return user.toString();
    }
    @GetMapping("req/addUser")
    public User addUser(@ModelAttribute("user") User user){
        return user;
    }

    @GetMapping("req/http")
    public String http(HttpServletRequest request){
        String name=request.getParameter("name");
        String pageNum=request.getParameter("pageNum");
        return name+","+pageNum;
    }

    @GetMapping("req/http2")
    public String http2(String name, int pageNum){
        return name+",,"+pageNum;
    }

    @GetMapping("req/param1")
    public String param1(
            @RequestParam("key1") String key1,
            @RequestParam("key2") String key2,
            @RequestParam String key3
    ){
        return key1+", "+key2+", "+key3;
    }

    @GetMapping("req/path/{path1}/{path2}")
    public String path(
            @PathVariable("path1") String path1,
            @PathVariable("path2") String path2
    ){
        return path1+", "+path2;
    }
}
