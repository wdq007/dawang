package com.dawang.introjava.comprehensive.fx;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**Introduction to Java Programming, Comprehensive Version (10th Edition)
 * 程序清单 15-9 ControlCircleWithMouseAndKey.java  522页
 * 为程序清单15-3中的ControlCircle 例子加入更多的控制:
 * 通过单击鼠标左 / 右按钮，或者按下 U 和 D 键来增加 / 减小圆的半径。
 * CirclePane 类(第丨2行)已经在程序清单15-3中定义了。
 */
public class ControlCircleWithMouseAndKey extends Application {
    private CirclePane circlePane = new CirclePane();
    @Override
    public void start(Stage primaryStage){
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().addAll(btEnlarge,btShrink);

        btEnlarge.setOnAction(e->circlePane.enlarge());
        btShrink.setOnAction(e->circlePane.shrink());

        circlePane.setOnMouseClicked(e ->{//针对鼠标单击事件的处理器被创建
            if(e.getButton()== MouseButton.PRIMARY){ //如果鼠标左键被单击，圆将变大
                circlePane.enlarge();
            }
            else if(e.getButton() == MouseButton.SECONDARY){ //如果鼠标右键被单击，圆将缩小
                circlePane.shrink();
            }
        });

        circlePane.setOnKeyPressed(e ->{ //针对按键事件的处理器被创建
            if(e.getCode() == KeyCode.U){//如果U键被按下，圆将变大
                circlePane.enlarge();
            }
            else if(e.getCode() == KeyCode.D){//如果D键被按下，圆将缩小
                circlePane.shrink();
            }
        });


        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox,Pos.CENTER);


        Scene scene = new Scene(borderPane,300,300);
        primaryStage.setTitle("ControlCircleWithMouseAndKey");
        primaryStage.setScene(scene);
        primaryStage.show();

        circlePane.requestFocus(); //使得circlePane可以接收键盘事件 没有这行的话，当你单击一个按钮后，circlePane 将不再被聚焦。
    }
}
