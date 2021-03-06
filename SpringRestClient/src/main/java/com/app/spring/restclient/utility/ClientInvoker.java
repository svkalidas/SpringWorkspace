package com.app.spring.restclient.utility;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ClientInvoker {
	
	private RestTemplate invoker;
	
	private static final String URI = "http://loacalhost:8080/SpringRESTfulWebservice/";
	
	
	public ClientInvoker() {
		invoker = new RestTemplate();
		MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
		messageConverter.setObjectMapper(new ObjectMapper());
		invoker.getMessageConverters().add(messageConverter);
	}
	
	public String getUri() {
		return URI;
	}
	
	public RestTemplate getInvoker() {
		return invoker;
	}
}
