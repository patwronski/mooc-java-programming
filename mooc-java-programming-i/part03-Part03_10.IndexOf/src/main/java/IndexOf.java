
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            numbersList.add(number);
        }

        scanner.close();

        System.out.print("Search for? ");
        int searchNumber = scanner.nextInt();

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == searchNumber) {
                System.out.println(searchNumber + " is at index " + i);
            }
        }
    }
}
