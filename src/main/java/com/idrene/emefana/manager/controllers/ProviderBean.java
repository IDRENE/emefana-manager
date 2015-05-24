package com.idrene.emefana.manager.controllers;

import java.util.List;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.Setter;

import com.idrene.emefana.manager.model.Provider;
import com.idrene.emefana.manager.service.ProviderServiceImpl;


@ManagedBean("providerController")
public class ProviderBean {
	@Autowired
	private ProviderServiceImpl providerService;
	
	private List<Provider> providerList;
	
	public List<Provider> getProviderList(){
		return providerList;
	}
	
	
	public List<Provider> allProviders(){
		providerList = providerService.providerListFromApi();
		for(Provider p: providerList){
			System.out.println("+++++"+p.getProviderId());
			System.out.println("+++++"+p.getProviderName());
			System.out.println();
		}
		return providerList;
	}
}
