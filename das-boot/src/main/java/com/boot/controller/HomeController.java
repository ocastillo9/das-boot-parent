package com.boot.controller;

import com.boot.util.CassandraService;
import com.boot.util.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oscar.castillo on 13/01/2017.
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private ApplicationContext context;

    @RequestMapping(method = RequestMethod.POST)
    public String home(){
        CassandraService cassandraService = context.getBean(CassandraService.class);
        cassandraService.getMyService().doStuff();

        /*MyService myService = context.getBean(MyService.class);
        myService.doStuff();*/
        return "Das Boot, reporting for duty!";
    }
}
