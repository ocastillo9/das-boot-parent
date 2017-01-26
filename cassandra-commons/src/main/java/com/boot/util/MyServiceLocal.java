package com.boot.util;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by oscar.castillo on 23/01/2017.
 */
public class MyServiceLocal implements MyService {

    @Value("${com.boot.ocastillo.util.key}")
    private String key;

    MyServiceLocal(){
        System.out.println("Staring MyService Local..."+key);
    }

    public void doStuff() {
        System.out.println("Using MyService Local..."+key);
    }
}
