package com.kensoftph.contextmenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private StackPane layout = new StackPane();
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/
        Scene scene = new Scene(layout, 400, 400);
        stage.setScene(scene);
        stage.setTitle("JavaFX ContextMenu");
        stage.show();
        conMenu();
    }

    private void conMenu(){
        Button btn = new Button("Right Click");
        layout.getChildren().add(btn);
        ContextMenu cm = new ContextMenu();
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");
        cm.getItems().addAll(cut, copy, paste);
        btn.setContextMenu(cm);
    }

    public static void main(String[] args) {
        launch();
    }
}