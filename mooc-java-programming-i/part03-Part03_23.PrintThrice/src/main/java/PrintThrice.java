
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word:");
        String word = String.valueOf(scanner.nextLine());
        String myWord = word;
        for (int i = 0; i < 2; i++){
            myWord += word;
        }
        System.out.println(myWord);
        // Write your program here

    }
}
