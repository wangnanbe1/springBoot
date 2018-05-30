package com.demo.controller;


import com.demo.entity.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("ftl")
public class freemarkerController {

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("resource",resource);
       return "freemarker/index";

    }
}
