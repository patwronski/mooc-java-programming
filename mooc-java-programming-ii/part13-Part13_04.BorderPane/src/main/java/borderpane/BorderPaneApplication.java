package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application{

    @Override
    public void start(Stage window) {
        Label N = new Label("NORTH");
        Label E = new Label("EAST");
        Label S = new Label("SOUTH");

        BorderPane layout = new BorderPane();
        layout.setTop(N);
        layout.setRight(E);
        layout.setBottom(S);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

}
