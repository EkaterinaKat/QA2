package com.katyshevtseva.qa2.view.utils;

import com.katyshevtseva.fx.WindowBuilder;
import com.katyshevtseva.qa2.core.CoreConstants;
import com.katyshevtseva.qa2.view.MainController;

public class QaWindowBuilder {
    public static void openMainWindow() {
        new WindowBuilder("/fxml/main.fxml").setTitle(CoreConstants.APP_NAME).setWidth(1735).setHeight(900).
                setController(new MainController()).showWindow();
    }
}
