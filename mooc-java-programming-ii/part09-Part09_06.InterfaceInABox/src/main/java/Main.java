
public class Main {

public static void main(String[] args) {
Box box = new Box(10);
Box hugeBox = new Box(1000);

hugeBox.add(new Book("Horstman", "Core Java",200));
box.add(hugeBox);
box.add(new Book("D", "B Java",1));
    
    System.out.println(box);
}

}
