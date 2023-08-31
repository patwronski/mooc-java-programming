import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            numbers.add(number);
        }

        int count = numbers.size();
        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = sum / count;

        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}