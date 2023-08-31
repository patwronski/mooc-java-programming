
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(Integer.valueOf(input) < 0){
                break;
            }
            numbers.add(input);
        }
        
        numbers.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .filter(n -> n >= 1 && n <= 5)
                .forEach(n -> System.out.println(n));
    }
}
