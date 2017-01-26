package com.boot.util;

/**
 * Created by oscar.castillo on 23/01/2017.
 */
public class CassandraService {

    private MyService myService;

    CassandraService (MyService myService){
        this.myService = myService;
        System.out.println("Init CassandraService...");
    }


    public MyService getMyService() {
        return myService;
    }

    public void setMyService(MyService myService) {
        this.myService = myService;
    }
}
