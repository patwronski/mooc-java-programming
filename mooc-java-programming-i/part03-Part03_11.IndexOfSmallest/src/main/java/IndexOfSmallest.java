import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();

            if (number == 9999) {
                break;
            }

            numbersList.add(number);
        }

        scanner.close();

        int smallestNumber = numbersList.get(0);

        for (int i = 1; i < numbersList.size(); i++) {
            int number = numbersList.get(i);
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

        System.out.println("Smallest number: " + smallestNumber);

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == smallestNumber) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
