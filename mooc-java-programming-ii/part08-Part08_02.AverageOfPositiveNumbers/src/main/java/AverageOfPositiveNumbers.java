
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<Integer> numbers = new ArrayList<>();
        float sum = 0;
        int counter = 0;
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input < 0){
                continue;
            }
            
            if (input == 0 && sum != 0) {
                System.out.println(sum/counter);
                break;
            } else if(input == 0 && sum == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            
            sum += input;
            counter++;
            
        }
    }
}
