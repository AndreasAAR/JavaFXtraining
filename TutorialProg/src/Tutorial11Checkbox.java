import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Tutorial11Checkbox extends Application {

    Stage window;
    Scene scene;
    Button button;


    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

         window = primaryStage;
         window.setTitle("Subway Ingredients");

        CheckBox tuna = new CheckBox("Tuna");
        CheckBox bacon = new CheckBox("Bacon");
        CheckBox huel = new CheckBox("Mint chocolate Huel");

         button = new Button("Order now!");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(button,tuna,bacon,huel);

        scene = new Scene(layout,300,250);

        window.setScene(scene);
        window.show();

        Label yeahBoiLabel = new Label("YEAH BOI");
        VBox YBLayout = new VBox(10);
        YBLayout.getChildren().add(yeahBoiLabel);
        Scene yeahBoiScene = new Scene(YBLayout,300,200);


        button.setOnAction(e -> {
            if(huel.isSelected()){
               window.setScene(yeahBoiScene);
            }

        });
    }
}
