package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;


public class NotifierApplication extends Application{

    @Override
    public void start(Stage window){
        TextField text = new TextField();
        Button button = new Button("Click");
        Label label = new Label();
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                label.setText(text.getText());
            }
        });
        
        VBox layout = new VBox();
        layout.getChildren().addAll(text, button, label);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
        
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
