/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public class Person {
    private String id;
    private String name;
    
    public Person(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Person)) {
            return false;
        }
        Person comparedPerson = (Person) compared;
        if (this.id.equals(comparedPerson.id)){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
    
}
