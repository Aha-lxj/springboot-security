package com.aha.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aha
 * @create 2022-07-22  22:45
 */
@Controller
public class ViewController {
    @RequestMapping({"/", "/index"})
    public String index(){
        return "index";
    }
    @RequestMapping("/toLogin")
    public String login(){
        return "views/login";
    }
    @RequestMapping("/level1/{id}")
    public String level1(@PathVariable("id") Integer id){
        return "views/level1/"+id;
    }
    @RequestMapping("/level2/{id}")
    public String level2(@PathVariable("id") Integer id){
        return "views/level2/"+id;
    }
    @RequestMapping("/level3/{id}")
    public String level3(@PathVariable("id") Integer id){
        return "views/level3/"+id;
    }
}
