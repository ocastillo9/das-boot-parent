package com.boot.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by oscar.castillo on 23/01/2017.
 */
@Component
public class AppConfig {

    @Bean
    @Profile("cloud")
    public MyService myService() {
        return new MyServiceImpl();
    }

    @Bean
    @Profile("local")
    public MyService myServiceLocal() {
        return new MyServiceLocal();
    }

    @Bean
    public CassandraService cassandraService(MyService myService) {
        return new CassandraService(myService);
    }



}