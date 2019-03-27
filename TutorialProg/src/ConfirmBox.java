import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import static javafx.geometry.Pos.BASELINE_LEFT;
import static javafx.geometry.Pos.CENTER;

public class ConfirmBox {

    //Are you sure? Button.

    static boolean answer;

    public static boolean display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);


        //create two buttons
        Button approveButton = new Button("Yes");
        Button disapproveButton = new Button("No");
        approveButton.setOnAction(e -> {
            answer = true;
            window.close();

        });
        disapproveButton.setOnAction(e -> {
            answer = false;
            window.close();

        });

        GridPane layout = new GridPane();
        layout.setAlignment(CENTER);

        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
        layout.getChildren().add(approveButton);
        layout.getChildren().add(disapproveButton);
        GridPane.setRowIndex(approveButton,0);
        GridPane.setColumnIndex(approveButton,0);
        GridPane.setRowIndex(disapproveButton,0);
        GridPane.setColumnIndex(disapproveButton,1);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }

}
