package com.idrene.emefana.manager.model;

import lombok.Getter;
import lombok.Setter;

public class ProviderAddress {

	@Setter @Getter private String street;
	@Setter @Getter private Object streetLine2;
	@Setter @Getter private City city;

}