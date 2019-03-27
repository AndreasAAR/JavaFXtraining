import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tutorial9GridPane extends Application {

    Stage window;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      window = primaryStage;
      window.setTitle("Java FX tut9");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(10);

        //UserName Label
       Label nameLabel = new Label("Username: ");
       GridPane.setConstraints(nameLabel,0,0);

       //UserName Input
        TextField nameInput = new TextField("your name");
        GridPane.setConstraints(nameInput, 1, 0);

        //Password Label
        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel, 0, 1);
        TextField passInput = new TextField();
        passInput.setPromptText("**********");
        //You can also use prompt text, thats different from default!
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Log in");
        GridPane.setConstraints(loginButton,1,2);

        grid.getChildren().addAll(nameLabel,nameInput,passInput,passLabel,loginButton);

        Scene defaultScene = new Scene(grid);
        window.setScene(defaultScene);

        window.show();
    }

}
