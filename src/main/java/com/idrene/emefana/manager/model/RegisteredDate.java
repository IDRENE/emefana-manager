package com.idrene.emefana.manager.model;

import lombok.Getter;
import lombok.Setter;

public class RegisteredDate {

	@Setter @Getter private Integer year;
	@Setter @Getter private String month;
	@Setter @Getter private Integer dayOfMonth;
	@Setter @Getter private String dayOfWeek;
	@Setter @Getter private String era;
	@Setter @Getter private Integer dayOfYear;
	@Setter @Getter private Boolean leapYear;
	@Setter @Getter private Integer monthValue;
	@Setter @Getter private Chronology chronology;

}