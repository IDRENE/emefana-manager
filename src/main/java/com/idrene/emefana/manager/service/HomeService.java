package com.idrene.emefana.manager.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService implements IHomeService{
	
	private List<String> members = Arrays.asList("Iddy", "Tolu");
	
	@Override
	public List<String> resultService(){
		return members;
	}
	
	public void membersList(){
		RestTemplate restfulTemp = new RestTemplate();
		String result = restfulTemp.getForObject("/url", String.class);
		//work with result
	}
	
}  