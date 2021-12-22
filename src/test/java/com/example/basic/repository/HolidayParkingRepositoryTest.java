package com.example.basic.repository;

import com.example.basic.model.HolidayParking;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Log4j2
class HolidayParkingRepositoryTest {

    @Autowired
    HolidayParkingRepository holidayParkingRepository;

    @Test
    void findAllWithPaging(){
        PageRequest pageRequest=PageRequest.of(1,5);
        Page<HolidayParking> list = holidayParkingRepository.findAll(pageRequest);
        log.info(list);
        log.info(list.getContent());
    }

}