package com.jeet.example.client.feign;

import com.jeet.example.client.ExampleFeignInterface;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class ExampleFeignRequestInterceptor implements RequestInterceptor
{

	@Autowired
	ExampleFeignInterface exampleFeignInterface;

	@Override public void apply(RequestTemplate requestTemplate)
	{
		HashMap<String,String> getHeaderValue = null;
		try
		{
			getHeaderValue = (HashMap<String, String>) exampleFeignInterface.getHeaderDetails();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		for(String headerKey : getHeaderValue.keySet()) {
			requestTemplate.header(headerKey,getHeaderValue.get(headerKey));
		}
	}
}
