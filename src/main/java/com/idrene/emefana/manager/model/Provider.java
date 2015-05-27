package com.idrene.emefana.manager.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Provider {

	@Setter @Getter private String providerId;
	@Setter @Getter private String providerName;
	@Setter @Getter private String businessDescription;
	@Setter @Getter private Boolean providerActive;
	@Setter @Getter private RegisteredDate registeredDate;
	@Setter @Getter private List<Double> providerLocation = new ArrayList<Double>();
	@Setter @Getter private ProviderAddress providerAddress;
	@Setter @Getter private List<ProviderService> providerServices = new ArrayList<ProviderService>();
	@Setter @Getter private List<ProviderVenue> providerVenues = new ArrayList<>();
	@Setter @Getter private List<ProviderFeature> providerFeatures = new ArrayList<>();
	@Setter @Getter private List<ProviderCategory> providerCategories = new ArrayList<ProviderCategory>();
	@Setter @Getter private List<ProviderEvent> providerEvents = new ArrayList<ProviderEvent>();
	//@Setter @Getter private List<Link> links = new ArrayList<>();

	public Provider(){}
	
	public Provider(String id, String name, String busDesc, Boolean isActive){
		this.providerId = id;
		this.providerName = name;
		this.businessDescription = busDesc;
		this.providerActive = isActive;
	}
	
}