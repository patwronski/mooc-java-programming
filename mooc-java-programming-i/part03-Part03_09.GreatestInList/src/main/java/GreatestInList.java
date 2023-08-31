
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
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

        int greatestNumber = numbersList.get(0);

        for (int i = 1; i < numbersList.size(); i++) {
            int number = numbersList.get(i);
            if (number > greatestNumber) {
                greatestNumber = number;
            }
        }

        System.out.println("The greatest number: " + greatestNumber);
    }
}