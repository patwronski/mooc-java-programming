
import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
                int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Search for? ");
        int searchNumber = scanner.nextInt();

        boolean found = false;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println(searchNumber + " is at index " + index + ".");
        } else {
            System.out.println(searchNumber + " was not found.");
        }
    }
}