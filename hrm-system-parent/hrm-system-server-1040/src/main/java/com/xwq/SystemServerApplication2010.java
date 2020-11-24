package com.xwq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 * @author PARADISE
 */
@SpringBootApplication
@EnableEurekaClient
public class SystemServerApplication2010
{
    public static void main( String[] args )
    {
        SpringApplication.run(SystemServerApplication2010.class);
    }
}
