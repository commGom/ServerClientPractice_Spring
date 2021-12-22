package com.example.basic.repository;

import com.example.basic.model.HolidayParking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayParkingRepository extends JpaRepository<HolidayParking,Integer> {


}
