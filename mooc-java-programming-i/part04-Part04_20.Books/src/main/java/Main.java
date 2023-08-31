import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title:");
            String title = String.valueOf(scanner.nextLine());
            if(title.isEmpty()){
                break;
            }
            
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year:");
            int publication = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, publication));
        }
        
        System.out.println("What information will be printed?");
        String choice = String.valueOf(scanner.nextLine());
        
        for (Book book: books){
            if (choice.equals("name")){
                System.out.println(book.title);
            }
            else if (choice.equals("everything")){
                System.out.println(book.returnFullBook());
            }
            
            
        }// implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
