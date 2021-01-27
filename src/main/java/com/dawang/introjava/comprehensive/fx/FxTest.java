package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.stage.Stage;

public class FxTest extends Application {

    public FxTest(){
        System.out.println("FxTest Contructor is invoked");
    }

    @Override
    public void start(Stage primaryStage){
        System.out.println("Start method is invoked");

    }
    public static void main(String[] args){
        System.out.println("Launch Application");
        Application.launch(args);
    }

}
