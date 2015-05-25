package com.idrene.emefana.manager.controllers;

import java.util.List;

import javax.annotation.ManagedBean;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;

import com.idrene.emefana.manager.service.HomeService;

@ManagedBean("selectorView")
public class HomeBean {
	
	@Autowired
	private HomeService homeService;
	
	@Setter @Getter private String text1;
	@Setter @Getter private String text2;
	@Getter private List<String> members;
	
	public String result(){
		/*call service layer method to delegate request here
		*It has to be spring service bean
		**/
		members = homeService.resultService();
		
		return "form1_result.jsf";
	}
}
