package com.viewhigh.mobile.ucenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ucenter")
public class UserController {

    @GetMapping("/user/{uid}")
    public String showUser(Model model,@PathVariable String uid){

        model.addAttribute("user_id",uid);

        return "/ucenter/showUser";
    }
}
