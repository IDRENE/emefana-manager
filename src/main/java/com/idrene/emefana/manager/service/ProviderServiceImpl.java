package com.idrene.emefana.manager.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.idrene.emefana.manager.model.Provider;

@Service
public class ProviderServiceImpl implements IProviderService{
	
	private Provider[] providers = {
			new Provider("001", "Sea Cliff Hotel", "Hotels and sea cruise", false),
			new Provider("002", "BreakPoint Group", "Cartering and Ceremony Venues", false),
			new Provider("003", "Haruni Kamara", "Master of Ceremony and Music", false)
	};
	private List<Provider> mockList = new ArrayList(Arrays.asList(providers));
	
	@Override
	public List<Provider> providerListFromApi(){
		System.out.println("This Provider Service method has been called \n");
		return mockList;
	}
}
