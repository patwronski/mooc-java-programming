
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;
        
        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            if(input.contains("add")) {
                String[] parts = input.split(" ");
                int value = Integer.valueOf(parts[1]);
                
                if(value < 0){
                    value = 0;
                }
                
                container1 = container1 + value;
                
                if(container1 > 100) {
                    container1 = 100;
                }
            }
            
            if(input.contains("move") && !input.contains("remove")) {
                String[] parts = input.split(" ");
                int value = Integer.valueOf(parts[1]);
                
                if(value < 0){
                    value = 0;
                }                
                
                if(container1 >= value) {
                    container2 += value;
                    container1 -= value;
                }
                else if(container1 < value) {
                    container2 += container1;
                    container1 = 0;
                    //System.out.println("cont1" + container1 + "value" + value);
                }
                
                if(container2 > 100) {
                    container2 = 100;
                }
                
            }
            
            if(input.contains("remove")) {
                String[] parts = input.split(" ");
                int value = Integer.valueOf(parts[1]);
                
                if(value < 0){
                    value = 0;
                }

                if(container2 >= value) {
                    container2 -= value;
                }
                else if(container2 < value) {
                    container2 = 0;
                }
                
                if(container2 < 0) {
                    container2 = 0;
                }
            }
            
            


        }
    }

}
