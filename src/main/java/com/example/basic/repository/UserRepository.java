package com.example.basic.repository;

import com.example.basic.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo,Integer> {
    public abstract UserInfo findByUserIdAndUserPw(String userId, String userPw);
}
