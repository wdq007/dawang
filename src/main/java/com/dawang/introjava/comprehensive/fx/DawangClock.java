package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class DawangClock extends Application {
    @Override
    public void start(Stage primaryStage){

        //Pane pane = new Pane();
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour()+":"+clock.getMinute()+":"+clock.getSecond();
        Label currentTimeLable = new Label(timeString);

        BorderPane pane = new BorderPane();

        pane.setCenter(clock);
        pane.setBottom(currentTimeLable);
        BorderPane.setAlignment(currentTimeLable, Pos.TOP_CENTER);

        Scene scene = new Scene(pane,300,300);
        primaryStage.setTitle("DawangClock");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
