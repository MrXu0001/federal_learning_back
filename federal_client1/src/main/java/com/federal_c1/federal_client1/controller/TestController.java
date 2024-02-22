package com.federal_c1.federal_client1.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/testGet",method = RequestMethod.GET)
    @ResponseBody
    public String testGet(String get){
        System.out.println(get);
        return "I get it";
    }

}
