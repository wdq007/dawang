package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Page 561
 * 程序清单16-9
 *
 */
public class ListViewDemo extends Application {
    //创建一个字符串数组
    private String[] mapTitles = {"Sichuan","Zhejiang","Shanxi","Jilin","Hubei","Jiangsu","Guangdong","Liaoning",
            "shandong"
    };
    //包含9个图像视图的数组
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

    @Override
    public void start(Stage primayStage){

        ListView<String> lv = new ListView<>(FXCollections.observableArrayList(mapTitles));
        lv.setPrefSize(200,250);

        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //列表视图的选择模式被设为多选

        FlowPane imagePane = new FlowPane(10,10);
        BorderPane pane = new BorderPane();
        pane.setLeft(new ScrollPane(lv)); //列表视图置于一个滚动面板中,这样当列表中的条目数超过显示区域的时候 可以滚动。
        pane.setCenter(imagePane);


        lv.getSelectionModel().selectedItemProperty().addListener(ov ->{
            imagePane.getChildren().clear();
            for(Integer i:lv.getSelectionModel().getSelectedIndices()){
                imagePane.getChildren().add(mapImage[i]);
            }
        });

       Scene scene = new Scene(pane,450,200);
       primayStage.setTitle("ListViewDemo");
       primayStage.setScene(scene);
       primayStage.show();


    }
}
