package com.td.test.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;

@SpringBootApplication
@EnableMBeanExport(registration= RegistrationPolicy.IGNORE_EXISTING) // Refer https://stackoverflow.com/a/49727876
public class ValkeyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValkeyDemoApplication.class, args);
	}

}
