
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where?");
        int low = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int high = Integer.valueOf(scanner.nextLine());
        
       
        //for (int i=0;i<numbers.size();i++){
        //    int number = numbers.get(i);
        //    if (number>=low && number<=high){
        //        myNumbers.add(number);
        //    }
        //}
        while (low <= high){
            int number = numbers.get(low);
            System.out.println(number);
            low = low + 1;
        }

    }
}
