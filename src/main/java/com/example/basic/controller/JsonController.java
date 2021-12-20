package com.example.basic.controller;

import com.example.basic.domain.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class JsonController {

    @GetMapping("json/string")
    @ResponseBody
    public String json(){
        return "json2/string";
    }

    @GetMapping("json/map")
    public Map<String,Object> jsonMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value");
        map.put("key2", 2324);
        map.put("key3",true);
        return map;
    }

    @GetMapping("json/exam")
    public Map<String,Object> jsonExam(){
        Map<String,Object> map=new HashMap<>();
        List<User> userList = new ArrayList<>();
        userList.add(new User("가","A","1"));
        userList.add(new User("나","B","2"));
        userList.add(new User("다","C","3"));
        userList.add(new User("라","D","4"));
        userList.add(new User("마","E","5"));
        userList.add(new User("바","F","6"));
        userList.add(new User("사","G","7"));
        userList.add(new User("아","H","8"));
        userList.add(new User("자","I","9"));
        map.put("count",userList.size());
        map.put("list",userList);
        return map;
    }
}
