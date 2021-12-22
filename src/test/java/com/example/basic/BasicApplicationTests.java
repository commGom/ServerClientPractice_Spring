package com.example.basic;

import com.example.basic.mapper.DemoMapper;
import com.example.basic.repository.JavaBoardRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Log4j2
@Transactional
class BasicApplicationTests {
	@Autowired
	DemoMapper demoMapper;
	@Test
	void contextLoads() {
		log.info(demoMapper.select());
	}

	@Autowired
	JavaBoardRepository javaBoardRepository;

	@Test
	void adbc(){
		log.info(javaBoardRepository.findAll());
	}
}
