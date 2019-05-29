package com.jeet.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jeet.example.to.UserTO;
import com.jeet.example.client.feign.ExampleFeignConfiguration;

@FeignClient(value = "example",configuration = ExampleFeignConfiguration.class)
public interface DemoInterface
{

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello();

	@RequestMapping(method = RequestMethod.POST, value = "/user", produces = "application/json; charset=UTF-8", headers = "application/vnd.collaborate.template.v1+json")
	public UserTO populateUser(UserTO userto);

}
