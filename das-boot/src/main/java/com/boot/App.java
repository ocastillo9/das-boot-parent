package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@ImportResource("cassandra.xml")
public class App 
{
    public static void main( String[] args )
    {
        // init
        SpringApplication.run(App.class,args);

    }
}
