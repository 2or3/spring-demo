package com.nikkei.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nikkei.demo.util.Log;

@Controller
public class HelloController {
    @GetMapping("/") // method & path
    public String getHello() {
        Log.debug("test");
        return "hello"; // template file name
    }
}
