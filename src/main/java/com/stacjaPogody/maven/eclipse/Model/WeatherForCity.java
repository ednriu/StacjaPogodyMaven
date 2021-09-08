package com.stacjaPogody.maven.eclipse.Model;

import java.util.Date;
import java.util.HashMap;

public class WeatherForCity {
	private String cityName;
	
	public WeatherForCity(String cityName)
	{
		this.cityName = cityName;
		Date firstDate = new Date();		
		System.out.println(firstDate.toString());		
		HashMap<Date, Integer> temperatures = new HashMap<Date, Integer>();
	    temperatures.put(firstDate, 23);
	    temperatures.put(firstDate, 20);
	    temperatures.put(firstDate, 17);
	    temperatures.put(firstDate, 23);
	    temperatures.put(firstDate, 34);    
		
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCityName() {
		return cityName;
	}


}
