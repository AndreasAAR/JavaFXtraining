import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;

//Java FX built into JDK. Pretty sweet.
public class Main extends Application{

    Stage window;
    Scene scene1, scene2, chungiScene;

    public static void main(String [] args){
            System.out.println("Hello World FX time");
            launch(args); //Starts the first window
    }
        @Override
        public void start(Stage primaryStage) throws Exception { //The inside content of window.


            window = primaryStage;
            Label label1 = new Label("Scene1");
            Label label2 = new Label("B I G  B O Y E");
            Button button1 = new Button("Go to scene 2");
            Button button2 = new Button("B I G  C H U N G U S");
            button2.setPrefSize(400,400);
            VBox chungLayout = new VBox();


            final String IMAGE_LOC = "/Chungus.png";
            final Image image = new Image(IMAGE_LOC);
            final int NUM_IMGS = 5;
            final double W = image.getWidth();
            final double H = image.getWidth();

            final Canvas canvas = new Canvas(W * NUM_IMGS, H);
            final GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.setFill(Color.GOLD);
            gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
            gc.setGlobalBlendMode(BlendMode.SCREEN);


            VBox layout1 = new VBox(20);
            layout1.getChildren().addAll(label1,button1);
            scene1 = new Scene(layout1,200,200);

            VBox layout2 = new VBox(20);
            layout2.getChildren().addAll(label2,button2);
            scene2 = new Scene(layout2,800,800);

            primaryStage.setScene(scene1);
            primaryStage.show();


            button1.setOnAction(e -> window.setScene(scene2));
            button2.setOnAction( e ->{

                    for (int i = 0 ; i < NUM_IMGS; i++) {
                        final double opacity = 1 - ((double) i) / NUM_IMGS;
                        System.out.println(opacity);
                        gc.setGlobalAlpha(opacity);
                        gc.setEffect(new BoxBlur(i * 2, i * 2, 3));
                        gc.drawImage(image, i * W, 0);
                    }

                       primaryStage.setScene(new Scene(new Group(canvas)));
                       primaryStage.show();
              }
            );


        }
}
