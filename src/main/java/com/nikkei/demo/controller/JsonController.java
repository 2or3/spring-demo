package com.nikkei.demo.controller;

import com.nikkei.demo.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JsonController {
    private static Demo demo;

    @RequestMapping(path = "/demo", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody Demo getJson() {
        demo = new Demo();
        SubDemo subDemo = new SubDemo();
        List<SubDemo> demolist = new ArrayList<SubDemo>();

        subDemo.name = "sub1";
        subDemo.type = "NO";
        subDemo.value = "yes";

        demo.name = "test1";
        demo.type = "1";
        demo.value = "test1";

        demolist.add(subDemo);
        demo.subDemos = demolist;

        return demo;
    }
}
