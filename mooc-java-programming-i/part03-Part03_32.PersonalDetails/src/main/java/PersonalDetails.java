
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<Integer> birthYearsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0].trim();
            int birthYear = Integer.parseInt(parts[1].trim());

            namesList.add(name);
            birthYearsList.add(birthYear);
        }

        scanner.close();

        String longestName = namesList.get(0);
        double sumOfYears = 0;

        for (String name : namesList) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        for (int year : birthYearsList) {
            sumOfYears += year;
        }

        double averageBirthYear = sumOfYears / birthYearsList.size();

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);
    }
}