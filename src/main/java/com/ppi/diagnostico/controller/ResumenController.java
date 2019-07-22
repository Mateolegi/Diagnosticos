package com.ppi.diagnostico.controller;

import com.ppi.diagnostico.util.SceneFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;

import static com.ppi.MainApp.STAGE;

public class ResumenController {

    public static final String FXML = "/fxml/resumen.fxml";
    @FXML private TextArea resumen;

    @FXML
    public void initialize() {
        resumen.setText("Nombre del equipo -> QXCO240\n" +
                "Procesador -> Intel(R) Core(TM) i7-6500 CPU @2.50GHz 2.60 GHz\n" +
                "Núcleos -> 2\n" +
                "Procesadores lógicos -> 4\n" +
                "Gráfica -> Intel(R) HD Graphics 520\n" +
                "Gráfica -> NVIDIA GeForce 920M\n" +
                "RAM -> 16.0 GB (1600 MHz)\n" +
                "Ranuras 2 de 2\n" +
                "Tipo de sistema -> 64 bits\n" +
                "S.O -> Windows 10 Pro\n" +
                "Disco duro -> 1 - 2 particiones\n" +
                "C: -> 120 GB(11.7 GB)\n" +
                "D: -> 106 GB(11.7 GB)\n");
    }

    @FXML
    public void volverPrincipal(ActionEvent e) {
        Scene scene = SceneFactory.createScene(InicioController.FXML);
        STAGE.setScene(scene);
    }
}
