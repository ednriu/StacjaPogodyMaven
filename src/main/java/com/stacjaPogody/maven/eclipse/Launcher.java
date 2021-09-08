package com.stacjaPogody.maven.eclipse;



import javafx.application.Application;
import javafx.stage.Stage;
import com.stacjaPogody.maven.eclipse.View.ViewFactory;



public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private WeatherManager weatherManager = new WeatherManager();;

    @Override
    public void start(Stage stage) throws Exception {
        //stage.show();
        ViewFactory viewFactory = new ViewFactory(weatherManager);
        viewFactory.showCitySelectionWindow();
        
    }


    @Override
    public void stop() throws Exception {
        
    }
}
