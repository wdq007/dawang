package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * Page 576
 * 程序清单16-15
 *
 *
 */
public class FlagAnthem extends Application {

    private static final int NUMBER_OF_NATIONS = 7;
    private static final String URLBase ="file:///Users/apple/IdeaProjects/dawang/src/main/resources/IMG/";
    private int currentIndex = 0;
    @Override
    public void start(Stage primaryStage){
        Image[] images = new Image[NUMBER_OF_NATIONS];
        MediaPlayer[] mediaPlayer = new MediaPlayer[NUMBER_OF_NATIONS];

        for(int i = 0;i<NUMBER_OF_NATIONS;i++){
            images[i] = new Image(URLBase+"flag"+i+".jpg");
            mediaPlayer[i] = new MediaPlayer(new Media(URLBase+"anthem"+i+".m4a"));

        }

        Button btPlayPause = new Button(">");
        btPlayPause.setOnAction(e->{
            if(btPlayPause.getText().equals(">")){ //当按钮被单击时，如果按钮当前的文字是>
                btPlayPause.setText("||"); //它的文 字被改为丨丨
                mediaPlayer[currentIndex].pause(); //并且暂停播放器
            }else{
                btPlayPause.setText(">"); //如果按钮的当前文字是丨丨, 则改为 >
                mediaPlayer[currentIndex].play(); //并继续播放
            }
        });
        //创建一个图像视图用于显示一个国旗图像
        ImageView imageView = new ImageView(images[currentIndex]);
        //创建一个组合框用于选择一个国家
        ComboBox<String> cboNation = new ComboBox<>();
        ObservableList<String> items = FXCollections.observableArrayList("Demark",
                "Germany","China","India","Norway","England","US");
        cboNation.getItems().addAll(items);

        cboNation.setValue(items.get(0));
        cboNation.setOnAction(e->{
            mediaPlayer[currentIndex].stop();//当组合框中一个新的国家名字被选择时，终止当前的音频
            currentIndex = items.indexOf(cboNation.getValue());
            imageView.setImage(images[currentIndex]); //显示最新选择国家的国旗图像
            mediaPlayer[currentIndex].play(); //并且播放新的国歌

        });

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btPlayPause,new Label("Select a Nation"),cboNation);
        hBox.setAlignment(Pos.CENTER);

        BorderPane pane = new BorderPane();
        pane.setCenter(imageView);
        pane.setBottom(hBox);

        Scene scene = new Scene(pane,400,300);
        primaryStage.setTitle("FlagAnthem");
        primaryStage.setScene(scene);
        primaryStage.show();



    }

}
