package ru.safin.communications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CommunicationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunicationsApplication.class, args);
	}

}
