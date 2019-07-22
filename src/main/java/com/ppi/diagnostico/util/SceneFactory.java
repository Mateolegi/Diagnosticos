package com.ppi.diagnostico.util;

import com.ppi.MainApp;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.UncheckedIOException;

import static com.ppi.diagnostico.util.Constants.HEIGHT;
import static com.ppi.diagnostico.util.Constants.WIDTH;

public class SceneFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);

    public static Scene createScene(String fxml) {
        return new SceneFactory().newScene(fxml);
    }

    private Scene newScene(String fxml) {
        try {
            LOGGER.debug("Loading FXML for main view from: {}", fxml);
            FXMLLoader loader = new FXMLLoader();
            Parent rootNode = loader.load(getClass().getResourceAsStream(fxml));
            Scene scene = new Scene(rootNode, WIDTH, HEIGHT);
            scene.getStylesheets().add("/styles/styles.css");
            return scene;
        } catch (IOException e) {
            LOGGER.error("There was an error creating scene.", e);
            throw new UncheckedIOException(e);
        }
    }
}
