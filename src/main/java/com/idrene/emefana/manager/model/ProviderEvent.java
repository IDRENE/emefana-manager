package com.idrene.emefana.manager.model;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

public class ProviderEvent {

	@Setter @Getter private String eventId;
	@Setter @Getter private String description;
	@Setter @Getter private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}