package com.stacjaPogody.maven.eclipse;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.stacjaPogody.maven.eclipse.Model.WeatherForCity;

public class WeatherManager {
	ObservableList<String> cities = FXCollections.observableArrayList();
	
	WeatherManager()
	{
		WeatherForCity firstCity = new WeatherForCity("Kalwaria");
		WeatherForCity secondCity = new WeatherForCity("Krak�w");

		cities.add("Kalwaria");
		cities.add("Krak�w");
		cities.add("Warszawa");
	}
	
	public ObservableList<String> getCities(){
		return cities;
	}

}
