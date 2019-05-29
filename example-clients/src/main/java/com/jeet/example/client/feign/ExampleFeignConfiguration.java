package com.jeet.example.client.feign;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

public class ExampleFeignConfiguration
{
	@Bean
	public RequestInterceptor requestInterceptor() {
		return new ExampleFeignRequestInterceptor();
	}
}
