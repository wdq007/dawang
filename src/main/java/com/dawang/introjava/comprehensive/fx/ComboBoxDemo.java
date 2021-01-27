package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Page 558
 * 程序清单16-8
 *
 */

public class ComboBoxDemo extends Application {

    //信息存储在三个数组
    private String[] mapTitles = {"Sichuan","Zhejiang","Shanxi","Jilin","Hubei","Jiangsu","Guangdong","Liaoning",
                                  "shandong"
    };

    private ImageView[] mapImage = {new ImageView(new Image("IMG/sichuan.jpg",200,200,true,true)),
            new ImageView(new Image("IMG/zhejiang.jpg",200,200,true,true)),
            new ImageView(new Image("IMG/shanxi.jpg",200,200,true,true)),
            new ImageView(new Image("IMG/jilin.jpg",200,200,true,true)),
            new ImageView(new Image("IMG/hubei.jpg",200,200,true,true)),
            new ImageView(new Image("IMG/jiangsu.jpg",200,200,true,true)),
            new ImageView(new Image("IMG/guangdong.jpg",200,200,true,true)),
            new ImageView(new Image("IMG/liaoning.jpg",200,200,true,true)),
            new ImageView(new Image("IMG/shandong.jpg",200,200,true,true))
    };

    private String[] mapDescription = new String[9];
    //程序创建 DescriptionPane 类的一个实例
    private DescriptionPane descriptionPane = new DescriptionPane();
    //创建一个组合框
    private ComboBox<String>  cbo = new ComboBox<>();

    @Override
    public void start(Stage primaryStage){

        mapDescription[0] = "Province:Sichuan";
        mapDescription[1] = "Province:Zhejiang";
        mapDescription[2] = "Province:Shanxi";
        mapDescription[3] = "Province:Jilin";
        mapDescription[4] = "Province:Hubei";
        mapDescription[5] = "Province:Jiangsu";
        mapDescription[6] = "Province:guangdong";
        mapDescription[7] = "Province:liaoning";
        mapDescription[8] = "Province:Shandong";

        setDisplay(0);

        BorderPane pane = new BorderPane();
        BorderPane paneForComboBox= new BorderPane();

        paneForComboBox.setLeft(new Label("Select a Province"));
        paneForComboBox.setCenter(cbo);
        pane.setTop(paneForComboBox);
        cbo.setPrefWidth(200);
        cbo.setValue("Sichuan");

        ObservableList<String> items = FXCollections.observableArrayList(mapTitles);
        //getltem()方法从组合框返回一个列表
        cbo.getItems().addAll(items);
        pane.setCenter(descriptionPane);
        cbo.setOnAction(e ->setDisplay(items.indexOf(cbo.getValue())));

        Scene scene = new Scene(pane,400,270);
        primaryStage.setTitle("ComboBoxDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void setDisplay(int index){
        descriptionPane.setTitle(mapTitles[index]);
        descriptionPane.setDescription(mapDescription[index]);
        descriptionPane.setImageView(mapImage[index]);

    }


}
