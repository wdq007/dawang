package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnonymousHandler  extends Application {
    @Override
    public void start(Stage primaryStage){

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        Button btnNew = new Button("New");
        Button btnOpen = new Button("Open");
        Button btnSave = new Button("Save");
        Button btnPrint = new Button("Print");
        hBox.getChildren().addAll(btnNew,btnOpen,btnSave,btnPrint);


        btnNew.setOnAction((ActionEvent e) -> {
            System.out.println("Process New");
        });


        btnOpen.setOnAction((e) -> {
            System.out.println("Process Open");
        });

        btnSave.setOnAction(e -> {
            System.out.println("Process Save");
        });

        btnPrint.setOnAction(e -> System.out.println("Process Print"));
        /*
        btnNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process New");
            }
        });

        btnOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process Open");
            }
        });

        btnPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process Print");
            }
        });


        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process Save");

            }
        });

        */
        Scene scene = new Scene(hBox,255,255);
        primaryStage.setTitle("Anonymous Handler");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
