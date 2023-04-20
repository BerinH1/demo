package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class LoginController {

    @RequestMapping(value ="/login", method = {RequestMethod.POST, RequestMethod.GET})
    public String displayLoginPage(@RequestParam(value = "error", required = false) String error,
                                   @RequestParam(value = "logout", required = false) String logout, Model model){

        String errorMessge = null;
        if(error != null){
            errorMessge = "Username or Password is incorrect";
        }if (logout != null){
            errorMessge = "You have been successfully logget out";
        }
        model.addAttribute("errorMessge", errorMessge);
        return "Login.html";


    }



}
