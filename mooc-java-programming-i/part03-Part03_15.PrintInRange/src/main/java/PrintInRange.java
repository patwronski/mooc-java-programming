
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(3);
numbers.add(2);
numbers.add(6);
numbers.add(-1);
numbers.add(5);
numbers.add(1);
printNumbersInRange(numbers, -99, 1);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        int index = 0;
        
        while (index<=numbers.size() - 1){
            int number = numbers.get(index);
            if (number >= lowerLimit && number <= upperLimit){
                System.out.println(number);
            }
            index++;
        }
    }
}
int[] arrayName = {1,2,3};
int[] arrayName = new int[3];
arrayList<Integer> arrayListName = new arrayList<>();