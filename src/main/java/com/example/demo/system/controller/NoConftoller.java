package com.example.demo.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.CurrentUser;

@RestController
@RequestMapping("/no")
public class NoConftoller {
    
    @GetMapping("test")
    public String teString(@RequestParam(required = false) String param) {
        System.out.println(CurrentUser.get());
        return new String("abc" + param);
    }
}
