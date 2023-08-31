
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("end")){
                break;
            }
            inputs.add(input);
        }
        
        String choice = String.valueOf(scanner.nextLine());
        
        if(choice.equals("p")){
            System.out.println(inputs.
                    stream().
                    mapToInt(s -> Integer.valueOf(s)).
                    filter(n -> n>0).
                    average().
                    getAsDouble());
        }
        if(choice.equals("n")){
            System.out.println(inputs.
                    stream().
                    mapToInt(s -> Integer.valueOf(s)).
                    filter(n -> n<0).
                    average().
                    getAsDouble());            
        }
                
    }
}
