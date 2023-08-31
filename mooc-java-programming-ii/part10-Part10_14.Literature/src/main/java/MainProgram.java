
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            String name = String.valueOf(scanner.nextLine());
            if(name.equals("")){
                break;
            }
            int ageRec = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, ageRec));
        }
        
        System.out.println(books.stream().count() + " books in total.");
        System.out.println('\n' + "Books:");
        
        /*Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        */
        books.stream().sorted().forEach(book -> System.out.println(book));
    }

}
