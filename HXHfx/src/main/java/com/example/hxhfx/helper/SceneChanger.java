package com.example.hxhfx.helper;

import com.example.hxhfx.MainApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Objects;

public class SceneChanger {
    public SceneChanger(AnchorPane currentView, String fxml) throws IOException {
        Pane nextView = FXMLLoader.load(Objects.requireNonNull(MainApplication.class.getResource(fxml)));
        currentView.getChildren().removeAll();
        currentView.getChildren().setAll(nextView);
    }
}