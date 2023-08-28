package com.company.Bankerschemacloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BankerSchemaCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankerSchemaCloudApplication.class, args);
	}

}
