package com.udr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by udr013 on 21-4-2016.
 */
@Controller
public class ThisController {

    @RequestMapping("/")
    public String startFrom(Model model){
        return "index";

    }
}
