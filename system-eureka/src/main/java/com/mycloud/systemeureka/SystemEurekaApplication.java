package com.mycloud.systemeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Application stater
 * @author albert-AsiaGroup
 * @date 2018-07-02
 */
@SpringBootApplication
@EnableEurekaServer
public class SystemEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemEurekaApplication.class, args);
	}
}
