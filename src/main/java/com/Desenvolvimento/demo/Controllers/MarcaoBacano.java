package com.Desenvolvimento.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MarcaoBacano {

    @GetMapping("/marcaoBacano")
    public String index()
    {
        return "marcaoBacano";
    }
}
