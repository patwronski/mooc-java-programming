
public class HealthStation {
    private int counter;

    public int weigh(Person person) {
        counter++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        int weight = person.getWeight();
        weight = weight + 1;
        person.setWeight(weight);
    }
    
    public int weighings(){
        return counter;
    }
    
}
