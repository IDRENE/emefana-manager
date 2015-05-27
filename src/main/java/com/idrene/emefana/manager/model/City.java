package com.idrene.emefana.manager.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class City {

	@Setter @Getter private String cid;
	@Setter @Getter private String region;
	@Setter @Getter private String country;
	@Setter @Getter private List<Double> location = new ArrayList<Double>();

}