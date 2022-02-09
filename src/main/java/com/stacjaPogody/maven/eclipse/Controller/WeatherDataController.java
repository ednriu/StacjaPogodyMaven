package com.stacjaPogody.maven.eclipse.Controller;


import java.awt.Insets;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Date;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import com.stacjaPogody.maven.eclipse.WeatherManager;
import com.stacjaPogody.maven.eclipse.Model.WeatherForCity;
import com.stacjaPogody.maven.eclipse.Model.WeatherTable;
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
	    private TableView<Integer> weatherTable;

	    @FXML
	    private Button changeCityButton;

	    @FXML
	    void CloseAction() {

	    }


	    @FXML
	    void showCitySelectionAction() {

	    }
	    
	    private LocalDate startDate;


		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			 
			List<Float> maxTemperaturesFirstCity = weatherManager.getMaximumTemperaturesForFirstCity();
			List<Float> minTemperaturesFirstCity = weatherManager.getMinimumTemperaturesForFirstCity();
			List<Float> maxTemperaturesSecondCity = weatherManager.getMaximumTemperaturesForSecondCity();
			List<Float> minTemperaturesSecondCity = weatherManager.getMinimumTemperaturesForSecondCity();
		        
			for (int i = 0; i < 5; i++) {
		            weatherTable.getItems().add(i);
		        }

     

		        startDate = java.time.LocalDate.now();
		        
		        TableColumn<Integer, String> dateColumn = new TableColumn<>("Data");
		        dateColumn.setCellValueFactory(cellData -> {
		            Integer rowIndex = cellData.getValue();
		            return new ReadOnlyStringWrapper(String.valueOf(startDate.plusDays(rowIndex)));
		        });

		        TableColumn<Integer, String> maxTempFirstCityColumn = new TableColumn<>("Max Temp.");
		        maxTempFirstCityColumn.setCellValueFactory(cellData -> {
		            Integer rowIndex = cellData.getValue();
		            return new ReadOnlyStringWrapper(String.valueOf(maxTemperaturesFirstCity.get(rowIndex)));
		        });
		        
		        TableColumn<Integer, String> minTempFirstCityColumn = new TableColumn<>("Min Temp");
		        minTempFirstCityColumn.setCellValueFactory(cellData -> {
		            Integer rowIndex = cellData.getValue();
		            return new ReadOnlyStringWrapper(String.valueOf(minTemperaturesFirstCity.get(rowIndex)));
		        });


		        
		        weatherTable.getColumns().add(dateColumn);     
		        
		        TableColumn firstCityNameCol = new TableColumn(weatherManager.getFirstCityName());
		        firstCityNameCol.getColumns().addAll(maxTempFirstCityColumn, minTempFirstCityColumn);
		        weatherTable.getColumns().add(firstCityNameCol);
		        
		        TableColumn<Integer, String> maxTempSecondCityColumn = new TableColumn<>("Max Temp.");
		        maxTempSecondCityColumn.setCellValueFactory(cellData -> {
		            Integer rowIndex = cellData.getValue();
		            return new ReadOnlyStringWrapper(String.valueOf(maxTemperaturesSecondCity.get(rowIndex)));
		        });
		        
		        TableColumn<Integer, String> minTempSecondCityColumn = new TableColumn<>("Min Temp");
		        minTempSecondCityColumn.setCellValueFactory(cellData -> {
		            Integer rowIndex = cellData.getValue();
		            return new ReadOnlyStringWrapper(String.valueOf(minTemperaturesSecondCity.get(rowIndex)));
		        });
		        
		        TableColumn secondCityNameCol = new TableColumn(weatherManager.getSecondCityName());
		        secondCityNameCol.getColumns().addAll(maxTempSecondCityColumn, minTempSecondCityColumn);
		        weatherTable.getColumns().add(secondCityNameCol);
		        
		}
		



}
