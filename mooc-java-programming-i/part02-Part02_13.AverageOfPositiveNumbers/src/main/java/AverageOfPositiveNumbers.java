import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> positiveNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            numbers.add(number);

            if (number > 0) {
                positiveNumbers.add(number);
            }
        }

        if (positiveNumbers.isEmpty()) {
            System.out.println("Cannot calculate the average");
        } else {
            int sum = 0;

            for (int positiveNumber : positiveNumbers) {
                sum += positiveNumber;
            }

            double average = (double) sum / positiveNumbers.size();

            System.out.println("The average is: " + average);
        }

        scanner.close();
    }
}