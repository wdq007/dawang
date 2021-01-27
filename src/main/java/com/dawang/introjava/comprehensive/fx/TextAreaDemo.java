package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * Page 556
 * 程序清单16-7
 * 程序创建了一个DescriptionPane类的实例
 */

public class TextAreaDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        DescriptionPane descriptionPane = new DescriptionPane();
        descriptionPane.setTitle("China");
        String description = "The Chinese National Flag... ";
        descriptionPane.setImageView(new ImageView(new Image("IMG/cn-flag.jpg",200,150,true,true)));
        descriptionPane.setDescription(description);

        Scene scene = new Scene(descriptionPane,500,150);
        primaryStage.setTitle("TextAreaDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
