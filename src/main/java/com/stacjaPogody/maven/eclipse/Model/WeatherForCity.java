package com.stacjaPogody.maven.eclipse.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class WeatherForCity {
	private String cityName;
	private String initialDate;

	List<Float> minimumTemperatures=new ArrayList<Float>();
	List<Float> maximumTemperatures=new ArrayList<Float>();
	
	public WeatherForCity()
	{
		this.cityName = "";
		this.initialDate = "01/01/2000";		
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}
	
	public String getInitialDate(){
		return initialDate;
	}
	
	public void addMinimumTemperature(Float newMinimumTemperature) {
		minimumTemperatures.add(newMinimumTemperature);
	}
	
	public List<Float> getMinimumTemperatures() {		
		return minimumTemperatures;
	}
	
	public void addMaximumTemperature(Float newMaximumTemperature) {
		maximumTemperatures.add(newMaximumTemperature);
	}
	
	public List<Float> getMaximumTemperatures() {		
		return maximumTemperatures;
	}


}
