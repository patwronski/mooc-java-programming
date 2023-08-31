
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        System.out.println("");
        printArray(array);
        swap(scanner, array);
        printArray(array);
    }
    
    public static int[] swap(Scanner sc, int[] array){
        System.out.println("Give two indices to swap");
        int firstIndex = Integer.valueOf(sc.nextLine());
        int secondIndex = Integer.valueOf(sc.nextLine());
        
        array[firstIndex] = array[firstIndex] + array[secondIndex];
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex] = array[firstIndex] - array[secondIndex];
        
        return array;
    }
    
    public static void printArray(int[] array){
        int index = 0;
        while(index < array.length){
            System.out.println(array[index]);
            index++;
        }
    }

}
