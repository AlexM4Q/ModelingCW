package com.modeling.cw;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class App extends Application {

    /**
     * Точка входа в программу
     */
    public static void main(final String[] args) {
        launch(App.class, args);
    }

    /**
     * Точка входа в форму
     */
    @Override
    public void start(final Stage primaryStage) throws Exception {
        final Parent root = FXMLLoader.load(getClass().getResource("/fxml/layout_main.fxml"));
        final Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
