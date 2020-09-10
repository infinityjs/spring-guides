package com.viewhigh.mobile.ucenter.controllers;

import com.viewhigh.mobile.ucenter.domain.UserEntity;
import com.viewhigh.mobile.ucenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    @GetMapping("/")
    public String showHome(Model model){



        return "/dashboard/index";
    }


}
