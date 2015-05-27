package com.idrene.emefana.manager.model;

import lombok.Getter;
import lombok.Setter;

public class ProviderVenue {

	@Setter @Getter private String name;
	@Setter @Getter private int capacity;
	@Setter @Getter private Price price;
}
