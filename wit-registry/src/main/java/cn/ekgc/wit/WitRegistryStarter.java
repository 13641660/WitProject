package cn.ekgc.wit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WitRegistryStarter {
	public static void main(String[] args) {
		SpringApplication.run(WitRegistryStarter.class, args);
	}
}
