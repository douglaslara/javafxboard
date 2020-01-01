package com.myjavafx.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class SceneFactory {

    public static Scene openingScene() {

        Button button = new Button();
        button.setText("click me");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
//        layout.setStyle("-fx-background-color: transparent;");

        Scene scene = new Scene(layout, 300, 300);
        return scene;
    }
}
