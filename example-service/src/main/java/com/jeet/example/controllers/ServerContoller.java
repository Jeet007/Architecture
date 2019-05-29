package com.jeet.example.controllers;

import com.jeet.example.client.DemoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeet.example.services.SampleService;
import com.jeet.example.to.UserTO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ServerContoller implements DemoInterface
{

	@Autowired
	private SampleService sampleService;

	@Autowired
	DemoInterface demoInterface;

	@Override
	public String hello()
	{
		log.info("This hello is from my first gradle multi module project");
		return "This hello is from my first gradle multi module project";
	}

	@RequestMapping("/hi")
	public String hi() {
		return demoInterface.hello();
	}

	@Override
	public UserTO populateUser(UserTO userTo)
	{
		return sampleService.getUser(userTo.getFirstName(), userTo.getLastName());
	}
}
