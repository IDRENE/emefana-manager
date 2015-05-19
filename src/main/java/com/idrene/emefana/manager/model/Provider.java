package com.idrene.emefana.manager.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "providerId", "providerName", "businessDescription",
		"providerActive", "registereDate", "providerLocation",
		"providerAddress", "providerServices", "providerFeatures",
		"providerVenues", "providerCategories", "providerEvents", "_links" })
public class Provider {

	@JsonProperty("providerId")
	private String providerId;
	@JsonProperty("providerName")
	private String providerName;
	@JsonProperty("businessDescription")
	private String businessDescription;
	@JsonProperty("providerActive")
	private Boolean providerActive;
	@JsonProperty("registeredDate")
	private RegisteredDate registeredDate;
	@JsonProperty("providerLocation")
	private List<Double> providerLocation = new ArrayList<Double>();
	@JsonProperty("providerAddress")
	private ProviderAddress providerAddress;
	@JsonProperty("providerServices")
	private List<ProviderService> providerServices = new ArrayList<ProviderService>();
	@JsonProperty("providerVenues")
	private List<Object> providerVenues = new ArrayList<Object>();
	@JsonProperty("providerCategories")
	private List<ProviderCategory> providerCategories = new ArrayList<ProviderCategory>();
	@JsonProperty("providerEvents")
	private List<ProviderEvent> providerEvents = new ArrayList<ProviderEvent>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The providerId
	 */
	@JsonProperty("providerId")
	public String getProviderId() {
		return providerId;
	}

	/**
	 * 
	 * @param providerId
	 *            The providerId
	 */
	@JsonProperty("providerId")
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	/**
	 * 
	 * @return The providerName
	 */
	@JsonProperty("providerName")
	public String getProviderName() {
		return providerName;
	}

	/**
	 * 
	 * @param providerName
	 *            The providerName
	 */
	@JsonProperty("providerName")
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	/**
	 * 
	 * @return The businessDescription
	 */
	@JsonProperty("businessDescription")
	public String getBusinessDescription() {
		return businessDescription;
	}

	/**
	 * 
	 * @param businessDescription
	 *            The businessDescription
	 */
	@JsonProperty("businessDescription")
	public void setBusinessDescription(String businessDescription) {
		this.businessDescription = businessDescription;
	}

	/**
	 * 
	 * @return The providerActive
	 */
	@JsonProperty("providerActive")
	public Boolean getProviderActive() {
		return providerActive;
	}

	/**
	 * 
	 * @param providerActive
	 *            The providerActive
	 */
	@JsonProperty("providerActive")
	public void setProviderActive(Boolean providerActive) {
		this.providerActive = providerActive;
	}

	/**
	 * 
	 * @return The registeredDate
	 */
	@JsonProperty("registeredDate")
	public RegisteredDate getRegistereDate() {
		return registeredDate;
	}

	/**
	 * 
	 * @param registereDate
	 *            The registereDate
	 */
	@JsonProperty("registereDate")
	public void setRegistereDate(RegisteredDate registeredDate) {
		this.registeredDate = registeredDate;
	}

	/**
	 * 
	 * @return The providerLocation
	 */
	@JsonProperty("providerLocation")
	public List<Double> getProviderLocation() {
		return providerLocation;
	}

	/**
	 * 
	 * @param providerLocation
	 *            The providerLocation
	 */
	@JsonProperty("providerLocation")
	public void setProviderLocation(List<Double> providerLocation) {
		this.providerLocation = providerLocation;
	}

	/**
	 * 
	 * @return The providerAddress
	 */
	@JsonProperty("providerAddress")
	public ProviderAddress getProviderAddress() {
		return providerAddress;
	}

	/**
	 * 
	 * @param providerAddress
	 *            The providerAddress
	 */
	@JsonProperty("providerAddress")
	public void setProviderAddress(ProviderAddress providerAddress) {
		this.providerAddress = providerAddress;
	}

	/**
	 * 
	 * @return The providerServices
	 */
	@JsonProperty("providerServices")
	public List<ProviderService> getProviderServices() {
		return providerServices;
	}

	/**
	 * 
	 * @param providerServices
	 *            The providerServices
	 */
	@JsonProperty("providerServices")
	public void setProviderServices(List<ProviderService> providerServices) {
		this.providerServices = providerServices;
	}

	/**
	 * 
	 * @return The providerVenues
	 */
	@JsonProperty("providerVenues")
	public List<Object> getProviderVenues() {
		return providerVenues;
	}

	/**
	 * 
	 * @param providerVenues
	 *            The providerVenues
	 */
	@JsonProperty("providerVenues")
	public void setProviderVenues(List<Object> providerVenues) {
		this.providerVenues = providerVenues;
	}

	/**
	 * 
	 * @return The providerCategories
	 */
	@JsonProperty("providerCategories")
	public List<ProviderCategory> getProviderCategories() {
		return providerCategories;
	}

	/**
	 * 
	 * @param providerCategories
	 *            The providerCategories
	 */
	@JsonProperty("providerCategories")
	public void setProviderCategories(List<ProviderCategory> providerCategories) {
		this.providerCategories = providerCategories;
	}

	/**
	 * 
	 * @return The providerEvents
	 */
	@JsonProperty("providerEvents")
	public List<ProviderEvent> getProviderEvents() {
		return providerEvents;
	}

	/**
	 * 
	 * @param providerEvents
	 *            The providerEvents
	 */
	@JsonProperty("providerEvents")
	public void setProviderEvents(List<ProviderEvent> providerEvents) {
		this.providerEvents = providerEvents;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}