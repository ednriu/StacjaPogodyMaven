package com.stacjaPogody.maven.eclipse.Controller;

import com.stacjaPogody.maven.eclipse.WeatherManager;
import com.stacjaPogody.maven.eclipse.View.ViewFactory;

public abstract class BaseController {

	protected WeatherManager weatherManager;
    protected ViewFactory viewFactory;
    private String fxmlName;

    public BaseController(ViewFactory viewFactory, WeatherManager weatherManager, String fxmlName) {
        this.viewFactory = viewFactory;
        this.weatherManager = weatherManager;
        this.fxmlName = fxmlName;
    }

    public String getFxmlName() {
        return fxmlName;
    }
}
