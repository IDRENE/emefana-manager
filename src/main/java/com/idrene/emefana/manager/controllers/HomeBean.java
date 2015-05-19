package com.idrene.emefana.manager.controllers;

import java.util.List;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import com.idrene.emefana.manager.service.HomeService;

@ManagedBean("selectorView")
public class HomeBean {
	
	@Autowired
	private HomeService homeService;
	
	private String text1;
	private String text2;
	private List<String> members;
	
	public String getText1() {
		return text1;
	}
	public void setText1(String text1) {
		this.text1 = text1;
	}
	public String getText2() {
		return text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}
	public List<String> getMembers() {
		return members;
	}
	public void setMembers(List<String> members) {
		this.members = members;
	}
	
	public String result(){
		/*call service layer method to delegate request here
		*It has to be spring service bean
		**/
		members = homeService.resultService();
		
		return "form1_result.jsf";
	}
}
