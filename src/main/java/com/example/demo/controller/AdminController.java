package com.example.demo.controller;

import com.example.demo.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class AdminController {

    @RequestMapping("/admin")
    public String displayAdminPage(Model model, Authentication authentication){
        model.addAttribute("username", authentication.get);
        model.addAttribute("roles", auth)

        return "admin.html";
}
    }
