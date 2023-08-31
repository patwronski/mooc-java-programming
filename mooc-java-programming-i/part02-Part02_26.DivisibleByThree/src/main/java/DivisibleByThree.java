public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(3, 6);
        System.out.println();
        divisibleByThreeInRange(2, 10);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int number = beginning; number <= end; number++) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}