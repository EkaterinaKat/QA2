package com.katyshevtseva.qa2;

import com.katyshevtseva.qa2.view.utils.QaWindowBuilder;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        QaWindowBuilder.openMainWindow();
    }
}
