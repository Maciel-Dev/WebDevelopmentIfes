package com.Desenvolvimento.demo.Controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/loginCustom")
    public String index()
    {
        return "loginTeste";
    }

    @PostMapping("/loginCustom")
    public String login(Model model, Authentication authentication, BCryptPasswordEncoder passwordEncoder, @RequestParam(name = "username") String name)
    {

        System.out.println(name);

        return "teste";
    }


}
