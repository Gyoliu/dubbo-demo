package com.web;


import com.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuxing on 2017/12/5.
 */
@Controller
public class MyController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String testSay(@RequestParam(value = "name",defaultValue = "") String name){
        return helloService.sayHello(name);
    }

}
