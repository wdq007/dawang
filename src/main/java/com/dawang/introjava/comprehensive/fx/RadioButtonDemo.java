package com.dawang.introjava.comprehensive.fx;


import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 * Page 550
 * 程序清单 16-4
 * RadioButtonDemo 继 承 自 CheckBoxDemo, 重 写 getPane()方 法
 */
public class RadioButtonDemo extends CheckBoxDemo{
    @Override
    protected BorderPane getPane(){
        BorderPane pane = super.getPane();

        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5,5,5,5));
        paneForRadioButtons.setStyle("-fx-border-color:green;-fx-border-width:2px");

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        paneForRadioButtons.getChildren().addAll(rbBlue,rbGreen,rbRed);
        pane.setLeft(paneForRadioButtons);

        ToggleGroup group = new ToggleGroup();
        //将单选按钮组在一起
        rbBlue.setToggleGroup(group);
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);

        rbRed.setOnAction(e->{
            if(rbRed.isSelected()){
                //rbRed.setTextFill(Color.RED);
                text.setFill(Color.RED);
            }
        });

        rbGreen.setOnAction(e ->{
            if(rbGreen.isSelected()){
                text.setFill(Color.GREEN);
            }
        });

        rbBlue.setOnAction(e ->{
            if(rbBlue.isSelected()){
                text.setFill(Color.BLUE);
            }
        });

    return pane;

    }



}
