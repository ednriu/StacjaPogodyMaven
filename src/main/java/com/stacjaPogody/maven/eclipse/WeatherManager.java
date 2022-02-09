package com.stacjaPogody.maven.eclipse;



import java.text.ParseException;
import java.util.List;

import com.stacjaPogody.maven.eclipse.Model.WeatherForCity;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class WeatherManager {
	private WeatherForCity weatherForFirstCity;
	private WeatherForCity weatherForSecondCity;

	
	WeatherManager()
	{
		weatherForFirstCity = new WeatherForCity();
		weatherForSecondCity = new WeatherForCity();
	}
	//First City
	public void setFirstCityName(String name) {
		weatherForFirstCity.setCityName(name);
	}
	
	public String getFirstCityName() {
		return weatherForFirstCity.getCityName();
	}
	
	public void addMinimumTemperatureForFirstCity(Float temperature) {
		this.weatherForFirstCity.addMinimumTemperature(temperature);
	}
	
	public List<Float> getMinimumTemperaturesForFirstCity(){
		return this.weatherForFirstCity.getMinimumTemperatures();
	}
	
	public void addMaximumTemperatureForFirstCity(Float temperature) {
		this.weatherForFirstCity.addMaximumTemperature(temperature);
	}
	
	public List<Float> getMaximumTemperaturesForFirstCity(){
		return this.weatherForFirstCity.getMaximumTemperatures();
	}
	
	//Second City
	public void setSecondCityName(String name) {
		weatherForSecondCity.setCityName(name);
	}
	
	public String getSecondCityName() {
		return weatherForSecondCity.getCityName();
	}
	
	public void addMinimumTemperatureForSecondCity(Float temperature) {
		this.weatherForSecondCity.addMinimumTemperature(temperature);
	}
	
	public List<Float> getMinimumTemperaturesForSecondCity(){
		return this.weatherForSecondCity.getMinimumTemperatures();
	}
	
	public void addMaximumTemperatureForSecondCity(Float temperature) {
		this.weatherForSecondCity.addMaximumTemperature(temperature);
	}
	
	public List<Float> getMaximumTemperaturesForSecondCity(){
		return this.weatherForSecondCity.getMaximumTemperatures();
	}

}
