package com.example.basic.repository;

import com.example.basic.model.Sunbyul;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Repository 생략가능
public interface SunbyulRepository extends JpaRepository<Sunbyul,Integer> {
    List<Sunbyul> findByAddressContaining(String address);
    List<Sunbyul> findByAddressContaining(String address, Pageable pageable);
}
