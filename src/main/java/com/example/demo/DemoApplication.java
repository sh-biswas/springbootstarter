package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext applicationContext)
	{
		return args ->
		{
			System.out.println("These are the beans in Spring Boot");
			String[] beans = applicationContext.getBeanDefinitionNames();
			Arrays.sort(beans);
			for(String bean:beans)
			{
				System.out.println(bean);
			}
		};
	}

}
