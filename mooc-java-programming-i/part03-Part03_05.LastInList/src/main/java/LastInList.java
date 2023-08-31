
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {
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

        // Get the index of the last element
        int lastIndex = list.size() - 1;

        // Get the last value using the index
        String lastValue = list.get(lastIndex);

        System.out.println(lastValue);
    }
}
