package com.idrene.emefana.manager.model;

import java.util.HashMap;
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
@JsonPropertyOrder({ "street", "streetLine2", "city" })
public class ProviderAddress {

	@JsonProperty("street")
	private String street;
	@JsonProperty("streetLine2")
	private Object streetLine2;
	@JsonProperty("city")
	private City city;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The street
	 */
	@JsonProperty("street")
	public String getStreet() {
		return street;
	}

	/**
	 * 
	 * @param street
	 *            The street
	 */
	@JsonProperty("street")
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * 
	 * @return The streetLine2
	 */
	@JsonProperty("streetLine2")
	public Object getStreetLine2() {
		return streetLine2;
	}

	/**
	 * 
	 * @param streetLine2
	 *            The streetLine2
	 */
	@JsonProperty("streetLine2")
	public void setStreetLine2(Object streetLine2) {
		this.streetLine2 = streetLine2;
	}

	/**
	 * 
	 * @return The city
	 */
	@JsonProperty("city")
	public City getCity() {
		return city;
	}

	/**
	 * 
	 * @param city
	 *            The city
	 */
	@JsonProperty("city")
	public void setCity(City city) {
		this.city = city;
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