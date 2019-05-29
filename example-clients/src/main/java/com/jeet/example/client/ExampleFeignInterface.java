package com.jeet.example.client;

import java.util.Map;

public interface ExampleFeignInterface
{

	public String getMicroServiceURL() throws Exception;

	public String getMicroserviceToken() throws Exception;

	public Map<String, String> getHeaderDetails() throws Exception;
}
