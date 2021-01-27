package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Page 574
 * 程序清单16-14
 *
 *
 */
public class MediaDemo  extends Application {
    //媒体源是一个 URL 字符串
    //private static final String  MEDIA_LOCAL = new File("/Users/apple/Downloads/IMG_0770.MOV").toURI().toString();
    //private static final String MEDIA_URL = "file:////Users/apple/Downloads/IMG_0770.MOV";
    //private static final String MEDIA_URL ="file:///Users/apple/IdeaProjects/dawang/src/main/resources/IMG/anthem6.m4a";
    private static final String MEDIA_URL = "https://vd3.bdstatic.com/mda-khjpr66zf979w2ex/mda-khjpr66zf979w2ex.mp4";


    @Override
    public void start(Stage primaryStage){
        //从这个 URL 创建一个 Media 对象
        Media media = new Media(MEDIA_URL);
        //从 Media 对象创建一个 MediaPlayer 对象
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        //从 MediaPlayer 对象创建一个 MediaView
        MediaView mediaView = new MediaView(mediaPlayer);
        //一个播放按钮被创建用于播放 / 暂停媒体
        Button playButton  = new Button(">");

        //如果按钮当前的文字 是>，则将文字改为 II。如果按钮当前的文字是 II，则将文字改为>，并且暂停播放器(第_32 行 )
        playButton.setOnAction(e ->{
            if(playButton.getText().equals(">")){
                mediaPlayer.play();
                playButton.setText("||");

            }else{
                mediaPlayer.pause();
                playButton.setText(">");
            }
        });
        //— 个重播按钮被创建(第37行)，并通过调用 seekCDuration.ZERO)以重设再次播放时间到媒体流的开始处。
        Button rewindButton = new Button("<<");
        rewindButton.setOnAction(e->mediaPlayer.seek(Duration.ZERO));
        //—个滑动条被创建用于设置音量
        Slider slVolumn = new Slider();
        slVolumn.setPrefWidth(150);
        slVolumn.setMaxWidth(Region.USE_PREF_SIZE);
        slVolumn.setMinWidth(10);
        slVolumn.setValue(50);
        //媒体播放器的音量属性绑定到滑动条上
        mediaPlayer.volumeProperty().bind(
                slVolumn.valueProperty().divide(100)
        );
        HBox hBox  = new HBox(10);

        hBox.setAlignment(Pos.CENTER);
        //将按钮和滑动条置于一个HBox中
        hBox.getChildren().addAll(playButton,rewindButton,new Label("Volumn"),slVolumn);

        BorderPane pane = new BorderPane();
        //将媒体视图置于边框面板中央
        pane.setCenter(mediaView);
        //HBox 放置在边框面板的底部
        pane.setBottom(hBox);

        Scene scene = new Scene(pane,600,500);
        primaryStage.setTitle("MediaDemo");
        primaryStage.setScene(scene);
        primaryStage.show();








    }


}
