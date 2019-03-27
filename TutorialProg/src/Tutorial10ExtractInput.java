import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Tutorial10ExtractInput extends Application {

     public static void main(String args){
         launch(args);
     }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        VBox layout = new VBox();

        Button done = new Button("Ok");
        layout.getChildren().add(done);
        TextField nameField = new TextField();
        nameField.setPromptText("Enter name here");
        layout.getChildren().add(nameField);

        done.setOnAction(e -> {
            String newName = nameField.getText();
            VBox stupidLayout = new VBox();
            Label stupidName = new Label("More like " + newName+"DERP amirite?");
            stupidLayout.getChildren().add(stupidName);
            Scene stupidScene = new Scene(stupidLayout);
            window.setScene(stupidScene);
        });

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }
}
