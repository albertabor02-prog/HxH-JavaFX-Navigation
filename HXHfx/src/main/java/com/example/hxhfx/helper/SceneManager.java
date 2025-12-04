package com.example.hxhfx.helper;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

public class SceneManager {

    private static final String BASE = "/com/example/view/";

    public static void switchTo(String fxml, Node sourceNode) {
        try {
            FXMLLoader loader = new FXMLLoader(SceneManager.class.getResource(BASE + fxml));

            if (loader.getLocation() == null) {
                System.out.println("⚠ FXML not found: " + BASE + fxml);
                return;
            }

            Parent root = loader.load();

            Stage stage = (Stage) sourceNode.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("⚠ ERROR loading: " + BASE + fxml);
        }
    }
}
