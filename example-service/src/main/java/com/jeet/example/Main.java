package com.jeet.example;

import com.jeet.example.client.autoconfiguration.ExampleClientAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {ExampleClientAutoConfiguration.class})
public class Main
{
	public static void main(String[] args)
	{
		SpringApplication.run(Main.class, args);
	}

}
