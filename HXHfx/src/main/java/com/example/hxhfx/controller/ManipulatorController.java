package com.example.hxhfx.controller;

import com.example.hxhfx.helper.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.Node;

public class ManipulatorController {
    @FXML
    protected void goToHome(javafx.event.ActionEvent event) {
        SceneManager.switchTo("home-view.fxml", (Node) event.getSource());
    }
}
