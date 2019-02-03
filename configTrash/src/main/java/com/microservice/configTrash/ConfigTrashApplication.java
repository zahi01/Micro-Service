package com.microservice.configTrash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigTrashApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigTrashApplication.class, args);
	}

}

