package com.example.basic.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class JavaBoardRepositoryTest {
    @Autowired
    private JavaBoardRepository javaBoardRepository;

    @Test
    void paging(){
        PageRequest pageRequest = PageRequest.of(1, 5);

        javaBoardRepository.findAll();
    }
}