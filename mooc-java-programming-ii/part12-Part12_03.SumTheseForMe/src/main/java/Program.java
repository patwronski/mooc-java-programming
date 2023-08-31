
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int[] numbers = {3, -1, 8, 4};


System.out.println(sum(numbers, 0, 1, -10, 10)); // 3?



    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        //toWhere = toWhere + 1;
        if(fromWhere < 0)
            fromWhere = 0;
        if(toWhere > array.length)
            toWhere = array.length;
        
        int sum = 0;
        
        //System.out.println(array.length);
        //System.out.println('\n');
        
        for(int i=fromWhere; i<toWhere; i++){
            //System.out.println(array[i]);
            if(array[i] >= smallest && array[i] <= largest){
                sum+=array[i];
            }
        }
        
        return sum;
    }

}
