package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application{

    
    public String getName(){
        Scanner scanner = new Scanner(System.in);
        return String.valueOf(scanner.nextLine());
    }
    
    @Override
    public void start(Stage window){
        window.setTitle(getName());
        window.show();
    }
}
