
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public class Room {
    private ArrayList<Person> people;
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        return people.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if(this.people.isEmpty()){
            return null;
        }
        
        Person shortestPerson = this.people.get(0);
        
        for(Person person : this.people){
            if(shortestPerson.getHeight() > person.getHeight()){
                shortestPerson = person;
            }            
        }
        
        return shortestPerson;
    }
    
    public Person take(){
        return this.people.remove(this.people.indexOf(shortest()));
    }
    
}

