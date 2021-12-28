package com.example.basic.controller;

import com.example.basic.domain.User;
import com.example.basic.domain.UserInfo;
import com.example.basic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/*")
public class SessionController {
    @Autowired
    private UserRepository userRepository;

    //주소는 한 개 http 메소드는 두 개(Get : 로그인을 위한 로그인 입력 화면을 제공, Post : 로그인 수행)
    @GetMapping("/login")
    public String login(){
        return "/user/login";
    }

    @PostMapping("/login")
    public String loginPost(UserInfo user, HttpSession session){

        UserInfo findUser = userRepository.findByUserIdAndUserPw(user.getUserId(), user.getUserPw());
        System.out.println(findUser);
        if (findUser!=null){
            session.setAttribute("user", user);
            return "redirect:/user/main";
        }else{
            return "redirect:/user/signup";
        }


    }
    @GetMapping("/main")
    public String main(){
        return "user/main";
    }

    @GetMapping("/signup")
    public void signup(){

    }
    @PostMapping("/signup")
    @ResponseBody
    public String signup(@ModelAttribute UserInfo user){
        System.out.println(user);
        userRepository.save(user);
//        return "redirect:/user/login";
        return "<script> alert('가입완료'); location.href='/user/login';</script>";
    }

}
