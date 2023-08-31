
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String var = String.valueOf(scanner.nextLine());
        
        try (Scanner scanner2 = new Scanner(Paths.get(var))){
            
            while (scanner2.hasNextLine()){
                System.out.println(scanner2.nextLine());
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
