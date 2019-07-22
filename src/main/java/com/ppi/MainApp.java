package com.ppi;

import com.ppi.diagnostico.controller.InicioController;
import com.ppi.diagnostico.util.SceneFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends Application {

    public static Stage STAGE;
    private static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        launch(args);
    }

    public void start(@NotNull Stage stage) {
        MainApp.STAGE = stage;
        LOGGER.debug("Showing JFX scene");
        Scene scene = SceneFactory.createScene(InicioController.FXML);
        stage.setTitle("Diagnóstico");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
