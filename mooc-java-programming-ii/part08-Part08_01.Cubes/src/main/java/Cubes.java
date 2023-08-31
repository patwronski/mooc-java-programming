
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = String.valueOf(scanner.nextLine());
            int intInput = 0;
            
            if (input.equals("end")) {
                break;
            }else {
                intInput = Integer.parseInt(input);
            }
            
            System.out.println(intInput * intInput * intInput);
        }
    }
}
