package com.dawang.introjava.comprehensive.fx;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Page 545
 * 程序清单 16-2
 * 使用按钮来控制一段文本的移动
 */
public class ButtonDemo  extends Application {
    protected Text  text = new Text(50,50,"Java Programming");


    //定义了一个受保护的getPaneO方法以返回一个面板.文本被声明为受保护的,从而可以被子类所访问到.
    protected BorderPane getPane(){
        HBox paneForButton = new HBox(20);
        //创建了两个按钮 btLeft 和 btRight, 每个按钮都包含一段文本和一个图像
        Button btLeft = new Button("Left",new ImageView(new Image("IMG/left.jpg",20,20,true,true)));
        Button btRight = new Button("Right", new ImageView(new Image("IMG/right.png",20,20,true,true)));
        //按钮置于一个HBox中
        paneForButton.getChildren().addAll(btLeft,btRight);
        paneForButton.setAlignment(Pos.CENTER);
        paneForButton.setStyle("-fx-border-color:green");

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(paneForButton); //HBox又放在一个border面板的底部

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        borderPane.setCenter(paneForText);//创建了一段文本并置于一个 border面板中央

        btLeft.setOnAction(e->text.setX(text.getX() -10));//btLeft的动作处 理器将文本往左边移动
        btRight.setOnAction(e->text.setX(text.getX()+10));//btRight 的动作处理器将文本往右边移动

        return borderPane;

    }
    @Override
    public void start(Stage primaryStage){
        Scene scene = new Scene(getPane(),400,200);
        primaryStage.setTitle("ButtonDemo");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
