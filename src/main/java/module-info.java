module stacjaPogody {
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.controls;
	requires javafx.base;
	requires json.simple;
	
    opens com.stacjaPogody.maven.eclipse;
    opens com.stacjaPogody.maven.eclipse.View;
    opens com.stacjaPogody.maven.eclipse.Controller;
    opens com.stacjaPogody.maven.eclipse.Model;
}