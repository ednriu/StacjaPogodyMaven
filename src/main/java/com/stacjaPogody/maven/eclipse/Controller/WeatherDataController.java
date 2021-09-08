package com.stacjaPogody.maven.eclipse.Controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import com.stacjaPogody.maven.eclipse.WeatherManager;
import com.stacjaPogody.maven.eclipse.View.ViewFactory;

public class WeatherDataController extends BaseController implements Initializable{
	
	 public WeatherDataController(ViewFactory viewFactory, WeatherManager weatherManager, String fxmlName) {
		super(viewFactory, weatherManager, fxmlName);
		// TODO Auto-generated constructor stub
	}

	  @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TableView<?> weatherTable;

	    @FXML
	    private Button changeCityButton;

	    @FXML
	    void CloseAction() {

	    }


	    @FXML
	    void showCitySelectionAction() {

	    }


		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
			
		}

}
