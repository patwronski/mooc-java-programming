
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type 'end' to stop.");
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("end")){
                break;
            }
            inputs.add(input);
        }
        System.out.println("average of the numbers: " + inputs.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble());
    }
}
