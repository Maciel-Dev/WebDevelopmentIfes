package com.Desenvolvimento.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/teste")
    public String testeIndex()
    {
        return "teste";
    }

    @GetMapping("/loginProp")
    public String login()
    {
        return "login";
    }


}
