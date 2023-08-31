public class AdvancedAstrology {
    public static void main(String[] args) {
        printSpaces(1);
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("*");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
            System.out.println();
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
            System.out.println();
        }
        
        printSpaces(height - 2);
        printStars(3);
        System.out.println();

        printSpaces(height - 2);
        printStars(3);
        System.out.println();
    }
}





