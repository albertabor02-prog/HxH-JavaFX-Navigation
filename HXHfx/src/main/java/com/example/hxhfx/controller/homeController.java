package com.example.hxhfx.controller;

import com.example.hxhfx.helper.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.Node;

public class homeController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void goToEmitterPage(javafx.event.ActionEvent event) {
        SceneManager.switchTo("Emitter.fxml", (Node) event.getSource());
    }

    @FXML
    protected void goToSpecialistPage(javafx.event.ActionEvent event) {
        SceneManager.switchTo("Specialist.fxml", (Node) event.getSource());
    }

    @FXML
    protected void goToTransmuterPage(javafx.event.ActionEvent event) {
        SceneManager.switchTo("Transmuter.fxml", (Node) event.getSource());
    }

    @FXML
    protected void goToEnhancerPage(javafx.event.ActionEvent event) {
        SceneManager.switchTo("Enhancer.fxml", (Node) event.getSource());
    }

    @FXML
    protected void goToManipulatorPage(javafx.event.ActionEvent event) {
        SceneManager.switchTo("Manipulator.fxml", (Node) event.getSource());
    }

    @FXML
    protected void goToConjurerPage(javafx.event.ActionEvent event) {
        SceneManager.switchTo("Conjurer.fxml", (Node) event.getSource());
    }
}
