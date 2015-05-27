package com.idrene.emefana.manager.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


public class ProviderFeature {
	
	@Setter @Getter private String name;
	@Setter @Getter private List<String> description = new ArrayList<>();

}
