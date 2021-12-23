package com.example.basic.repository;

import com.example.basic.model.HolidayParking;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HolidayParkingRepository extends JpaRepository<HolidayParking,Integer> {
    List<HolidayParking> findByAddress(String address);
    List<HolidayParking> findByAddressContaining(String address);

}
