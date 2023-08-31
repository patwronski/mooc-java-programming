package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;



public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        Label lettersLabel = new Label("Letters: ");
        Label wordsLabel = new Label("Words: ");
        Label longestLabel = new Label("The longest word is: ");
        TextArea input = new TextArea();
        HBox footer = new HBox();
        
        footer.getChildren().addAll(lettersLabel, wordsLabel, longestLabel);
        input.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            lettersLabel.setText("Letters: " + characters);
            wordsLabel.setText("Words: " + words);
            longestLabel.setText("The longest word is: " + longest);
        });
        
        layout.setCenter(input);
        layout.setBottom(footer);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
