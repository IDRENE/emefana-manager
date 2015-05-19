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
@JsonPropertyOrder({ "year", "month", "dayOfMonth", "dayOfWeek", "era",
		"dayOfYear", "leapYear", "monthValue", "chronology" })
public class RegisteredDate {

	@JsonProperty("year")
	private Integer year;
	@JsonProperty("month")
	private String month;
	@JsonProperty("dayOfMonth")
	private Integer dayOfMonth;
	@JsonProperty("dayOfWeek")
	private String dayOfWeek;
	@JsonProperty("era")
	private String era;
	@JsonProperty("dayOfYear")
	private Integer dayOfYear;
	@JsonProperty("leapYear")
	private Boolean leapYear;
	@JsonProperty("monthValue")
	private Integer monthValue;
	@JsonProperty("chronology")
	private Chronology chronology;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The year
	 */
	@JsonProperty("year")
	public Integer getYear() {
		return year;
	}

	/**
	 * 
	 * @param year
	 * The year
	 */
	@JsonProperty("year")
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * 
	 * @return The month
	 */
	@JsonProperty("month")
	public String getMonth() {
		return month;
	}

	/**
	 * 
	 * @param month
	 * The month
	 */
	@JsonProperty("month")
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	 * 
	 * @return The dayOfMonth
	 */
	@JsonProperty("dayOfMonth")
	public Integer getDayOfMonth() {
		return dayOfMonth;
	}

	/**
	 * 
	 * @param dayOfMonth
	 * The dayOfMonth
	 */
	@JsonProperty("dayOfMonth")
	public void setDayOfMonth(Integer dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	/**
	 * 
	 * @return The dayOfWeek
	 */
	@JsonProperty("dayOfWeek")
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	/**
	 * 
	 * @param dayOfWeek
	 * The dayOfWeek
	 */
	@JsonProperty("dayOfWeek")
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	/**
	 * 
	 * @return The era
	 */
	@JsonProperty("era")
	public String getEra() {
		return era;
	}

	/**
	 * 
	 * @param era
	 * The era
	 */
	@JsonProperty("era")
	public void setEra(String era) {
		this.era = era;
	}

	/**
	 * 
	 * @return The dayOfYear
	 */
	@JsonProperty("dayOfYear")
	public Integer getDayOfYear() {
		return dayOfYear;
	}

	/**
	 * 
	 * @param dayOfYear
	 * The dayOfYear
	 */
	@JsonProperty("dayOfYear")
	public void setDayOfYear(Integer dayOfYear) {
		this.dayOfYear = dayOfYear;
	}

	/**
	 * 
	 * @return The leapYear
	 */
	@JsonProperty("leapYear")
	public Boolean getLeapYear() {
		return leapYear;
	}

	/**
	 * 
	 * @param leapYear
	 * The leapYear
	 */
	@JsonProperty("leapYear")
	public void setLeapYear(Boolean leapYear) {
		this.leapYear = leapYear;
	}

	/**
	 * 
	 * @return The monthValue
	 */
	@JsonProperty("monthValue")
	public Integer getMonthValue() {
		return monthValue;
	}

	/**
	 * 
	 * @param monthValue
	 * The monthValue
	 */
	@JsonProperty("monthValue")
	public void setMonthValue(Integer monthValue) {
		this.monthValue = monthValue;
	}

	/**
	 * 
	 * @return The chronology
	 */
	@JsonProperty("chronology")
	public Chronology getChronology() {
		return chronology;
	}

	/**
	 * 
	 * @param chronology
	 *  The chronology
	 */
	@JsonProperty("chronology")
	public void setChronology(Chronology chronology) {
		this.chronology = chronology;
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