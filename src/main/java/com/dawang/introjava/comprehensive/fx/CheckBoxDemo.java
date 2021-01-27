package com.dawang.introjava.comprehensive.fx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;



/**
 * Page 548
 * 程序清单16-3
 * CheckBoxDemo继承自 ButtonDemo并且重写了 getPane方法
 */

public class CheckBoxDemo extends ButtonDemo{
    @Override
    protected BorderPane getPane(){
        //新的 getPane 方法调用 ButtonDemo 类的 super . getPaneO 方法来获得一个包含了按钮和文本的 border 面 板
        BorderPane pane = super.getPane();

        Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20);
        Font fontBold = Font.font("Times New Roman",FontWeight.BOLD,FontPosture.REGULAR,20);
        Font fontItalic = Font.font("Times New Roman",FontWeight.NORMAL,FontPosture.ITALIC,20);
        Font fontNormal = Font.font("New Times Roman",FontWeight.NORMAL,FontPosture.REGULAR,20);

        text.setFont(fontNormal);

        VBox paneForCheckBoxes = new VBox(20);

        paneForCheckBoxes.setPadding(new Insets(5,5,5,5));
        paneForCheckBoxes.setStyle("-fx-border-color:green");
        CheckBox checkBoxBold = new CheckBox("Bold");
        CheckBox checkBoxItalic = new CheckBox("Italic");
        paneForCheckBoxes.getChildren().addAll(checkBoxBold,checkBoxItalic);// 复选框被创建并加人到 paneForCheckBoxes 中
        pane.setRight(paneForCheckBoxes); //paneForCheckBoxes 被加人到 border 面板中
        //它根据复选框的状态来设置 合适的字体。
        EventHandler<ActionEvent> handler = e->{
            if(checkBoxBold.isSelected() && checkBoxItalic.isSelected()){
                text.setFont(fontBoldItalic);
            }else if(checkBoxBold.isSelected()){
                text.setFont(fontBold);
            }else if(checkBoxItalic.isSelected()){
                text.setFont(fontItalic);
            }else{
                text.setFont(fontNormal);
            }
        };

        checkBoxBold.setOnAction(handler);
        checkBoxItalic.setOnAction(handler);
        return pane;
    }
}
