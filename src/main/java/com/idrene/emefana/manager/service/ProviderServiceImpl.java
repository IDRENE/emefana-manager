package com.idrene.emefana.manager.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.reflect.TypeToken;
import com.idrene.emefana.manager.model.Provider;

@Service
public class ProviderServiceImpl implements IProviderService {

	private List<String> members = Arrays.asList("Iddy", "Tolu");

	private Provider[] providers = {
			new Provider("001", "Sea Cliff Hotel", "Hotels and sea cruise",
					false),
			new Provider("002", "Akemi Co LTD",
					"Hotels, Cartering and Ceremony Venues", true),
			new Provider("003", "BreakPoint Group",
					"Cartering and Ceremony Venues", false),
			new Provider("004", "Haruni Kamara",
					"Master of Ceremony and Music", false) };
	private List<Provider> mockList = new ArrayList(Arrays.asList(providers));

	@Override
	public List<Provider> providerListFromApi() {
		return mockList;
	}

	public List<String> sampleMembers() {
		jsonToJavaProvider();
		jsonToJavaListProviders();
		return members;
	}

	public void jsonProviders() {
		RestTemplate restfulTemp = new RestTemplate();
		Provider result = restfulTemp.getForObject("/url", Provider.class);
		// work with result
	}

	/*
	 * This only return one provider from a given json source
	 */
	public Provider jsonToJavaProvider() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(
				DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Provider providerFromJson = null;
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("provider.json")
					.getFile());
			providerFromJson = mapper.readValue(file, Provider.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return providerFromJson;
	}

	/*
	 * This returns a list of providers from a given json source
	 */
	public List<Provider> jsonToJavaListProviders() {
		ObjectMapper objMapper = new ObjectMapper();
		objMapper
				.configure(
						DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
						false);
		List<Provider> providerList = new ArrayList<Provider>();
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("providersList.json")
				.getFile());
		try {

			TypeToken<List<Provider>> token = new TypeToken<List<Provider>>() {
			};
			providerList = objMapper.readValue(
					file,
					TypeFactory.defaultInstance().constructCollectionType(
							List.class, Provider.class));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return providerList;
	}
}
