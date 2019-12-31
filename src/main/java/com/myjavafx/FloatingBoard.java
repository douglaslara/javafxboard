package com.myjavafx;

import com.myjavafx.scenes.SceneFactory;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Hello world!
 */
public class FloatingBoard extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        setStageProperties(primaryStage);
        primaryStage.setScene(SceneFactory.openingScene());
        primaryStage.show();
    }

    private void setStageProperties(Stage primaryStage) {
        primaryStage.setTitle("Floating Board");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
    }
}
