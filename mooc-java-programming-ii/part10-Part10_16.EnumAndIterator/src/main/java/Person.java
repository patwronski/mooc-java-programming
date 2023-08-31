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
    private Education lvl;
    private String name;
    
    public Person(String name, Education lvl){
        this.lvl = lvl;
        this.name = name;
    }
    
    public Education getEducation(){
        return this.lvl;
    }
    
    @Override
    public String toString(){
        return this.name + ", " + lvl;
    }
}
