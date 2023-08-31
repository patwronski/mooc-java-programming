
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
    
    public static void printValues(HashMap<String,Book> map){
        for(Book book : map.values()){
            System.out.println(book);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> map, String text){
        for(Book book : map.values()){
            String value = book.getName();
            if(value.contains(text)){
                System.out.println(book);
            }
        }
    }

}
