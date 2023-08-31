
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int counter2 = 0;
        while(true){
            System.out.println("Give a number:");
            
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            counter+=number;
            counter2++;
            
            
            
            
        }
        System.out.println("Number of numbers: " + counter2);
        System.out.println("Sum of the numbers: " + counter);
    }
}
