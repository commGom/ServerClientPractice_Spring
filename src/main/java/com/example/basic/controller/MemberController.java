package com.example.basic.controller;

import com.example.basic.domain.Member;
import com.example.basic.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member/*")
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/signup")
    public void signUp(){

    }
    @PostMapping("/signup")
    @ResponseBody
    public String signUp(@ModelAttribute Member member, Model model){
        Member checkUserId=memberRepository.findByUserId(member.getUserId());
        String result=String.format("%s 는 중복된 아이디, 등록 실패",member.getUserId());
        if (checkUserId==null){
            memberRepository.save(member);
            model.addAttribute("userId",member.getUserId());
            result=String.format("아이디 -> %s 등록 완료",member.getUserId());
        }

        return result;
    }
}
