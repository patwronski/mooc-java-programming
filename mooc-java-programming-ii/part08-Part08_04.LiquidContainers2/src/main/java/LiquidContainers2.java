
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            
            String input = scan.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }
            
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                first.add(amount);
            }
            
            if (command.equals("move")) {
                if (first.contains() < amount) {
                    second.add(first.contains());
                    first.remove(first.contains());
                } else {
                    second.add(amount);
                    first.remove(amount);
                }
            }
            
            if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
