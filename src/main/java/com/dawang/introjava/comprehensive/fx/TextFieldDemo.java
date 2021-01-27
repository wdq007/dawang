package com.dawang.introjava.comprehensive.fx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * Page 552
 * 程序清单 16-5
 * TextFieldDemo 继承自 Radi oButtonDemo，增加了一个标签和文本域让用户输 人新的文本
 * 当在文本域中设定了一个新的文本并且按回车键后，一条新的消息将被显示
 */
public class TextFieldDemo extends RadioButtonDemo{
    @Override
    protected BorderPane getPane(){
        BorderPane pane = super.getPane();

        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5,5,5,5));
        paneForTextField.setStyle("-fx-border-color:green");
        paneForTextField.setLeft(new Label("Enter a new message here: "));

        TextField tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTextField.setCenter(tf);
        pane.setTop(paneForTextField);
        //在文本域中按冋车键将触发一个动作事件
        tf.setOnAction(e -> text.setText(tf.getText())
        );

        return pane;
    }
}
