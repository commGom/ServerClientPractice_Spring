package com.example.basic.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DemoMapper {
    public List<Map<String,Object>> select();
    public List<Map<String,Object>> findByUser(String user);
}
