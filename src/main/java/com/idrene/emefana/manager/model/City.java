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
@JsonPropertyOrder({ "cid", "region", "country", "location" })
public class City {

	@JsonProperty("cid")
	private String cid;
	@JsonProperty("region")
	private String region;
	@JsonProperty("country")
	private String country;
	@JsonProperty("location")
	private List<Double> location = new ArrayList<Double>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The cid
	 */
	@JsonProperty("cid")
	public String getCid() {
		return cid;
	}

	/**
	 * 
	 * @param cid
	 * The cid
	 */
	@JsonProperty("cid")
	public void setCid(String cid) {
		this.cid = cid;
	}

	/**
	 * 
	 * @return The region
	 */
	@JsonProperty("region")
	public String getRegion() {
		return region;
	}

	/**
	 * 
	 * @param region
	 * The region
	 */
	@JsonProperty("region")
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * 
	 * @return The country
	 */
	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 * The country
	 */
	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 
	 * @return The location
	 */
	@JsonProperty("location")
	public List<Double> getLocation() {
		return location;
	}

	/**
	 * 
	 * @param location
	 * The location
	 */
	@JsonProperty("location")
	public void setLocation(List<Double> location) {
		this.location = location;
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