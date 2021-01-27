package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DawangEvent extends Application {
    @Override
    public void start(Stage primaryStage){

        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);

        Button btnOk = new Button("Ok");
        Button btnCancel = new Button("Cancel");

        OKHandler handler1 = new OKHandler();
        btnOk.setOnAction(handler1);

        CancelHandler handler2 = new CancelHandler();
        btnCancel.setOnAction(handler2);

        hBox.getChildren().addAll(btnCancel,btnOk);

        Scene scene = new Scene(hBox,255,255);
        primaryStage.setTitle("DawangEvent");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}

class OKHandler implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        System.out.println("Ok button Clicked");




    }
}

class CancelHandler implements  EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        System.out.println("Cancel button clicked");
    }
}
