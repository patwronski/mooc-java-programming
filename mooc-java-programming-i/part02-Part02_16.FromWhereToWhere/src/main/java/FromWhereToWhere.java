import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int to = scanner.nextInt();

        System.out.println("Where from? ");
        int from = scanner.nextInt();

        if (to < from) {
            System.out.println("No numbers to print.");
        } else {
            for (int i = from; i <= to; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}