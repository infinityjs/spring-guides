package com.viewhigh.mobile.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.viewhigh.mobile.*" })
@EnableJpaRepositories("com.viewhigh.mobile.*")
@EntityScan(basePackages = "com.viewhigh.mobile.*")
public class MobileWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileWebappApplication.class, args);
	}

}
