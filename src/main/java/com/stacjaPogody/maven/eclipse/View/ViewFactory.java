package com.stacjaPogody.maven.eclipse.View;


import java.io.IOException;
import java.util.ArrayList;

import com.stacjaPogody.maven.eclipse.Controller.BaseController;
import com.stacjaPogody.maven.eclipse.Controller.SelectCitiesController;
import com.stacjaPogody.maven.eclipse.Controller.WeatherDataController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.stacjaPogody.maven.eclipse.WeatherManager;

public class ViewFactory {
	
	private ArrayList<Stage> activeStages;
    private WeatherManager weatherManager;
	
	public ViewFactory(WeatherManager weatherManager) {
        activeStages = new ArrayList<Stage>();
        this.weatherManager = weatherManager;
    }
	
    public void showCitySelectionWindow(){
        BaseController controller = new SelectCitiesController(this, weatherManager, "/View/citySelection.fxml");
        initializeStage(controller);
    }
    
    public void showWeatherDataWindow(){
        BaseController controller = new WeatherDataController(this, weatherManager, "/View/citySelection.fxml");
        initializeStage(controller);
    }

    private void initializeStage(BaseController baseController){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
        fxmlLoader.setController(baseController);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene = new Scene(parent);
        //updateStyle(scene);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        activeStages.add(stage);
    }

    public  void closeStage(Stage stageToClose){
        stageToClose.close();
        activeStages.remove(stageToClose);
    }

}
