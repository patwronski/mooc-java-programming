
import java.lang.reflect.Array;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.valueOf(scanner.nextLine());
        String y = Integer.toString(x);
        
        for(int i = 0; i < y.length(); i++){
            System.out.println(y[i]);
        }
    }
}
