
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        
        while (true){
            String id = String.valueOf(scanner.nextLine());
            if (id.isEmpty()){
                break;
            }            
            String name = String.valueOf(scanner.nextLine());
            if (name.isEmpty()){
                break;
            }           


            
            Person test = new Person(id, name);            
            if (!people.contains(test)){
                people.add(test);
            }
            
        }
        
        //printing
        for(Person entry : people){
            System.out.println(entry);
        }
        
    }
}
