package com.example.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
public class DBController {
    @Autowired
    JdbcTemplate jt;

    @Autowired
    DataSource ds;

    @GetMapping("/db/test")
    @ResponseBody
    public List<Map<String, Object>> dbTest(@RequestParam(value="user",required = false, defaultValue = "") String user){
        return jt.queryForList("select * from demo where user=?",user);
    }

    @GetMapping("/db/test1")
    @ResponseBody
    public List<Map<String, Object>> dbTest1(@RequestParam(value="user",required = false, defaultValue = "") String user){
        return jt.queryForList("select * from demo where user like concat('%',?,'%')",user);
    }

    @GetMapping("/db/test/{user}")
    @ResponseBody
    public List<Map<String, Object>> dbTest2(@PathVariable("user") String user){
        return jt.queryForList("select * from demo where user=?",user);
    }

    @GetMapping("/db/park/{address}")
    @ResponseBody
    public List<Map<String, Object>> parkDB(@PathVariable("address") String address){
        return jt.queryForList("select * from holiday_parking where address like concat('%',?,'%')",address);
    }
}
