package com.boot.util;

/**
 * Created by oscar.castillo on 23/01/2017.
 */
public class MyServiceImpl implements MyService {

    MyServiceImpl(){
        System.out.println("Staring MyService...");
    }


    public void doStuff() {
        System.out.println("Using MyService...");
    }
}
