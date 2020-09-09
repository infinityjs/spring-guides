package com.viewhigh.mobile.ucenter.controllers;

import com.viewhigh.mobile.ucenter.domain.UserEntity;
import com.viewhigh.mobile.ucenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/ucenter")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{uid}")
    public String showUser(Model model,@PathVariable String uid){

        model.addAttribute("user_id",uid);

        return "/ucenter/showUser";
    }

    @GetMapping("/showUserDetail")
    public String showUserByname(Model model,String username){


        UserEntity user = userService.findUserByUsername(username);
        if (user !=null) {
            model.addAttribute("status","0");
            model.addAttribute("userEntity", user);
        }else model.addAttribute("status","1");
        return "/ucenter/showUserDetail";
    }

}
