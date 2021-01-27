package com.dawang.introjava.comprehensive.fx;

import javafx.geometry.Insets;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;


/**
 * Page
 * 程序清单 16-6 继承自 BorderPane 的命名为 DescriptionPane
 * 这个类包含了一个滚动面板内的文本区域，以及一个显示一个图像图标和一个标题的标 签。
 */

public class DescriptionPane extends BorderPane {

    private Label lblImageTitle = new Label();
    private TextArea taDescription = new TextArea();

    public DescriptionPane(){
        lblImageTitle.setContentDisplay(ContentDisplay.CENTER);
        lblImageTitle.setPrefSize(200,100);

        lblImageTitle.setFont(new Font("SansSerif",16));
        taDescription.setFont(new Font("Serif",14));
        //文 本区域设置为不可编辑的
        taDescription.setEditable(false);
        //当文本不能一行内显示的时候自动换行
        taDescription.setWrapText(true);
        //Scroll Pane 为文本区域提供滚动功能
        ScrollPane scrollPane = new ScrollPane(taDescription);

        setLeft(lblImageTitle);
        setCenter(scrollPane);
        setPadding(new Insets(5,5,5,5));

    }

    public void setTitle(String title){
        lblImageTitle.setText(title);
    }

    public void setImageView(ImageView icon){
        lblImageTitle.setGraphic(icon);
    }

    public void setDescription(String text){
        taDescription.setText(text);
    }
}
