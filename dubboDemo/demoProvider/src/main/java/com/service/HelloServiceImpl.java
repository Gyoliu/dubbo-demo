package com.service;

import com.api.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by liuxing on 2017/12/5.
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return name + " say：Hello World !";
    }
}
