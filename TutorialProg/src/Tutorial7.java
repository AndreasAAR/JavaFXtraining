import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tutorial7 extends Application{

    private static Stage window;
    Button button;

    public static void main(String args[]){

        Tutorial7 t7 = new Tutorial7();
        launch();
    }

    @Override
   public void start(Stage primaryStage) {
       window = primaryStage;
       window.setTitle("JavaFX ");
       button = new Button("OK!");

       StackPane layout = new StackPane();
       layout.getChildren().add(button);
       Scene scene = new Scene(layout, 300, 250);
       window.setScene(scene);
       window.show();

       button.setOnAction( e -> {

           closeProgram();

       });

   }

   public void closeProgram(){
        boolean exit = ConfirmBox.display("Exit","You sure you want to exit?");
        if(exit){
            window.close();
        }
   }
}
