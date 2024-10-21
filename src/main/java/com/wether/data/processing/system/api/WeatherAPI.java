package com.wether.data.processing.system.api;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class WeatherAPI {

	private String apiKey = "your_api_key";

	public WeatherAPI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeatherAPI(String apiKey) {
		super();
		this.apiKey = apiKey;
	}

	private static String getValueOfExist(Document parentElement, String childTagName, String attributeName) {

		NodeList childList = parentElement. getElementsByTagName(childTagName);	
		return null;

	}
}
