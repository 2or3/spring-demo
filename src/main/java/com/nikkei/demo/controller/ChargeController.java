package com.nikkei.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nikkei.demo.util.Log;

@Controller
public class ChargeController {
    @GetMapping("/charge") // method & path
    public String getCharge() {
        Log.info("test");
        return "charge"; // template file name
    }
}
