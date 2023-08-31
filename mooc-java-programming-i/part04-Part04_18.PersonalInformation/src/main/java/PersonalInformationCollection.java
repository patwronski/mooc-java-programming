
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("First name:");
            String fname = String.valueOf(scanner.nextLine());
            
            if(fname.equals("")){
                break;
            }
            
            System.out.println("Last name:");
            String sname = String.valueOf(scanner.nextLine());
            System.out.println("Identification number:");
            String id = String.valueOf(scanner.nextLine());
            
            infoCollection.add(new PersonalInformation(fname, sname, id));
        }
        
        for(PersonalInformation ps: infoCollection){
            System.out.println(ps.getFirstName() + " " + ps.getLastName());
        }
    }
}
