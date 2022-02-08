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
			 List<Integer> intValues = Arrays.asList(1, 2, 3, 4, 5);
		     //List<String> stringValues = Arrays.asList("One", "Two", "Three", "Four", "Five");
			 List<Float> temperatury = weatherManager.getMaximumTemperaturesForFirstCity();

		        for (int i = 0; i < intValues.size() && i < temperatury.size(); i++) {
		            weatherTable.getItems().add(i);
		        }

     

		        startDate = java.time.LocalDate.now();
		        
		        TableColumn<Integer, String> intColumn = new TableColumn<>("Data");
		        intColumn.setCellValueFactory(cellData -> {
		            Integer rowIndex = cellData.getValue();
		            return new ReadOnlyStringWrapper(String.valueOf(startDate.plusDays(rowIndex)));
		        });

		        TableColumn<Integer, String> nameColumn = new TableColumn<>("Temperatura Minimalna");
		        nameColumn.setCellValueFactory(cellData -> {
		            Integer rowIndex = cellData.getValue();
		            return new ReadOnlyStringWrapper(String.valueOf(temperatury.get(rowIndex)));
		        });

		        weatherTable.getColumns().add(intColumn);
		        weatherTable.getColumns().add(nameColumn);
		        
		}
		



}
