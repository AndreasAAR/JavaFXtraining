import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import javax.crypto.AEADBadTagException;

public class TutorialNewBoston5_AlertBoxes extends Application{

    Stage window;
    Button button;

    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){

            window = primaryStage;
            window.setTitle("JAVA FX 3000 : BRING THE PANE");
            button = new Button("Click");
            StackPane layout = new StackPane();
            layout.getChildren().add(button);
            Scene scene = new Scene(layout, 300, 250);

            button.setOnAction(e -> {
                boolean deleteConfirmed =ConfirmBox.display("Choice","Are you sure you want to delete data?");
                if(deleteConfirmed){
                    AlertBox.display("NOTICE!","DELETING DATA");
                }
            });

            window.setScene(scene);
            window.show();

            window.setOnCloseRequest( e -> {

                    Platform.exit();
                    System.exit(0);

            });

    }

}
