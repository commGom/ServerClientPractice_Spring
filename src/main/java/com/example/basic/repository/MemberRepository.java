package com.example.basic.repository;

import com.example.basic.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Integer> {
    Member findByUserId(String userId);
    Member findByUserIdAndUserPassword(String userId,String userPassword);
}
