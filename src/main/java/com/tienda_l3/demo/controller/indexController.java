package com.tienda_l3.demo.controller;

import com.tienda_l3.demo.domain.Cliente;
import com.tienda_l3.demo.dao.ClienteDao;
import com.tienda_l3.demo.service.ClienteService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class indexController {

    @GetMapping("/")
    public String inicio(Model model) {

        return "index";
    }

}
