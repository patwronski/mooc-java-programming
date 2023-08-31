
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            list.add(input);
        }

        scanner.close();

        // Get the first value from the list
        String firstValue = list.get(0);

        // Get the last value from the list
        String lastValue = list.get(list.size() - 1);

        System.out.println(firstValue);
        System.out.println(lastValue);
    }
}