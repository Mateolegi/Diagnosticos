package com.ppi.diagnostico.controller;

import com.ppi.diagnostico.util.SceneFactory;
import javafx.event.ActionEvent;
import javafx.scene.Scene;

import static com.ppi.MainApp.STAGE;

public class InicioController {

    public static final String FXML = "/fxml/inicio.fxml";

    public void empezarAnalisis(ActionEvent actionEvent) {
        Scene scene = SceneFactory.createScene(AnalisisController.FXML);
        STAGE.setScene(scene);
    }
}
