package com.idrene.emefana.manager.controllers;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Autowired;

import com.idrene.emefana.manager.model.Provider;
import com.idrene.emefana.manager.service.ProviderServiceImpl;


@ManagedBean("providerController")
@SessionScoped
public class ProviderBean {
	@Autowired
	private ProviderServiceImpl providerService;
	
	private List<Provider> providerList;
	@Getter private String providerHome = "PROVIDERS MANAGEMENT";
	private List<String> members;
	
	public List<String> getMembers(){
		return providerService.sampleMembers();
	}
	
	public List<Provider> getProviderList(){
		return providerService.providerListFromApi();
		//return providerService.jsonToJavaListProviders();
	}
	
	//for activation of member or de-activation
	public String changeStatus(Provider provider){
		//work with provider in hand..
		return "providers.jsf";
	}
}
