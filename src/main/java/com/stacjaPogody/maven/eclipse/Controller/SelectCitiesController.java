package com.stacjaPogody.maven.eclipse.Controller;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import com.stacjaPogody.maven.eclipse.WeatherManager;
import com.stacjaPogody.maven.eclipse.Model.APIConnector;
import com.stacjaPogody.maven.eclipse.View.ViewFactory;

public class SelectCitiesController extends BaseController implements Initializable{

	public SelectCitiesController(ViewFactory viewFactory, WeatherManager weatherManager, String fxmlName) {
		super(viewFactory, weatherManager, fxmlName);
		// TODO Auto-generated constructor stub
	}
	
    @FXML
    private Button WybierzButton;

    @FXML
    private Button AnulujButton;

    @FXML
    private TextField editWyjazdZ;

    @FXML
    private TextField editWyjazdDo;

    @FXML
    private TextField temp1;
    
    private final String cityAPI = "https://www.metaweather.com/api/location/search/?query=";

    private final String weatherAPI = "https://www.metaweather.com/api/location/";
    
    private double liczba;

    @FXML
    void AnulujButtonAction() {
    	viewFactory.showWeatherDataWindow();
    	Stage stage = (Stage) WybierzButton.getScene().getWindow();
    	viewFactory.closeStage(stage);
    }




		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub

			
		}
		
	    @FXML		
	    void WybierzButtonAction(ActionEvent e) throws MalformedURLException {

	    	weatherManager.setFirstCityName(editWyjazdZ.getText());
	    	weatherManager.setFirstCityInitialDate(GetWeatherInformation(getWoeid(),0).get("applicable_date").toString());
	    	for (int i = 0; i < 5; i++) {
	    		weatherManager.addMinimumTemperatureForFirstCity(Float.parseFloat(GetWeatherInformation(getWoeid(),i).get("min_temp").toString()));
	    	}
	    	
	    	for (int i = 0; i < 5; i++) {
	    		weatherManager.addMaximumTemperatureForFirstCity(Float.parseFloat(GetWeatherInformation(getWoeid(),i).get("max_temp").toString()));
	    	}
	

	    	


	        
	        //echo
	        System.out.println(weatherManager.getFirstCityName());
	        //System.out.println(weatherManager.getMinimumTemperaturesForFirstCity());
	        //System.out.println(weatherManager.getMaximumTemperaturesForFirstCity());
	    	viewFactory.showWeatherDataWindow();
	    	Stage stage = (Stage) WybierzButton.getScene().getWindow();
	    	viewFactory.closeStage(stage);

	    }

	    public String getWoeid() throws MalformedURLException {
	        APIConnector apiConnectorCity = new APIConnector(cityAPI);
	        JSONObject jsonData = (JSONObject) (apiConnectorCity.getJSONArray(editWyjazdZ.getText())).get(0);
	        return jsonData.get("woeid").toString();
	    }

	    public JSONObject GetWeatherInformation(String woeid, int dayNumber) throws MalformedURLException {
	        APIConnector apiConnectorWeather = new APIConnector(weatherAPI);
	        JSONObject weatherJSONObject = apiConnectorWeather.getJSONObject(woeid + "/");
	        JSONArray weatherArray = (JSONArray) weatherJSONObject.get("consolidated_weather");
	        return  (JSONObject) weatherArray.get(dayNumber);
	    }

}
