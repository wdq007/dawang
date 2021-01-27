package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DawangImage extends Application {
    @Override
    public void start(Stage primaryStage){

        Pane pane = new HBox();
        pane.setPadding(new Insets(5,5,5,5));
        Image image = new Image("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2077947143,2646761393&fm=26&gp=0.jpg");

        ImageView view1= new ImageView(image);
        ImageView view2 = new ImageView(image);
        ImageView view3 = new ImageView(image);

        view2.setFitHeight(100);
        view2.setFitWidth(100);
        view3.setRotate(90);

        pane.getChildren().addAll(view1,view2,view3);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("DawangImage");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
