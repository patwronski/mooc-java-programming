
import java.util.Scanner;
import java.util.ArrayList;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "X";
        ArrayList<String> words = new ArrayList<>();
        
        while(!sentence.equals("")){
            sentence = String.valueOf(scanner.nextLine());
            String[] pieces = sentence.split(" ");
            for(String piece:pieces){
                words.add(piece);
            }
        }
        
        for(String word:words){
            if(word.contains("av")){
                System.out.println(word);
            }
        }
        
    }
}
