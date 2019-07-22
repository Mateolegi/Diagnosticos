package com.ppi.diagnostico.controller;

import com.ppi.diagnostico.util.SceneFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.ppi.MainApp.STAGE;

public class AnalisisController {

    public static final String FXML = "/fxml/analisis.fxml";
    @FXML private ProgressBar progressBar;
    @FXML private TextArea texto;
    @FXML private Button verResumenButton;
    private static final Logger LOGGER = LoggerFactory.getLogger(AnalisisController.class);

    private final String[] cal = new String[]{
            "Obteniendo nombre del equipo...\n",
            "Obteniendo información del procesador...\n",
            "Obteniendo información de los núcleos...\n",
            "Obteniendo información de la gráfica integrada...\n",
            "Obteniendo información de la gráfica dedicada...\n",
            "Obteniendo información de la memoria RAM...\n",
            "Obteniendo información del tipo de sistema...\n",
            "Obteniendo información del sistema operativo...\n",
            "Obteniendo número de discos...\n",
            "Detectando particiones...\n"
    };

    @FXML
    public void initialize() {

    }

    @FXML
    public void empezarCalculo(MouseEvent event) {
        System.out.println("entra");
        for (int i = 1; i <= 100; i++) {
            try {
                progressBar.setProgress(i);
                calculando(i);
                Thread.sleep(200);
            } catch (Exception e) {

            }
        }
        verResumenButton.setVisible(true);
    }

    @FXML
    public void verResumen(ActionEvent event) {
        Scene scene = SceneFactory.createScene(ResumenController.FXML);
        STAGE.setScene(scene);
    }

    private void calculando(int index) {
        if (index % 10 == 0) {
            int num = (index / 10);
            LOGGER.info(cal[num]);
            texto.appendText(cal[num]);
        }
    }
}
